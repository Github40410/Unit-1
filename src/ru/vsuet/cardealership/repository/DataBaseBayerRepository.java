package ru.vsuet.cardealership.repository;

import ru.vsuet.cardealership.domain.Bayer;
import ru.vsuet.cardealership.domain.Car;
import ru.vsuet.cardealership.domain.Category;
import ru.vsuet.cardealership.domain.Gender;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseBayerRepository implements Repository<Bayer>, GetIdBayer<Bayer> {
    private final Connection connection;
    public DataBaseBayerRepository(DataBaseConnector connector){this.connection = connector.getConnection();}

    @Override
    public Bayer find(Long id) {
        String query = "select * from bayer where ID = ?";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            Bayer bayer;
            while (resultSet.next()) {
                long idn = resultSet.getLong("ID");
                String name = resultSet.getString("name");
                Long age = resultSet.getLong("age");
                String gender = resultSet.getString("gender");
                if(gender.equals("MALE")) {
                    bayer = new Bayer(idn, age, name, Gender.MALE);
                    return bayer;
                }
                if(gender.equals("FEMALE")) {
                    bayer = new Bayer(idn, age, name, Gender.FEMALE);
                    return bayer;
                }
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }

    @Override
    public void add(Bayer bayer) {
        String query = "insert into bayer (name, age, gender) values (?, ?, ?);";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, bayer.getName());
            statement.setLong(2, bayer.getAge());
            if(bayer.getGender().equals(Gender.MALE)){
                statement.setString(3, "MALE");
            }
            else if(bayer.getGender().equals(Gender.FEMALE)){
                statement.setString(3, "FEMALE");
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }

    @Override
    public void remove(Bayer bayer) {
        String query = "delete from bayer where name=?;";
        String name = bayer.getName();
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }

    @Override
    public List<Bayer> list() {
        String query = "select * from bayer;";
        List<Bayer> bayers = new ArrayList<Bayer>();
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                long idn = resultSet.getLong("ID");
                String name = resultSet.getString("name");
                long age = resultSet.getLong("age");
                String gender = resultSet.getString("gender");
                if(gender.equals("MALE")) {
                    Bayer bayer = new Bayer(idn, age, name, Gender.MALE);
                    bayers.add(bayer);
                }
                else if(gender.equals("FEMALE")) {
                    Bayer bayer = new Bayer(idn, age, name, Gender.FEMALE);
                    bayers.add(bayer);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
        return bayers;
    }

    @Override
    public Long getId(Bayer source) {
        String query = "select * from bayer where name = ?";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, source.getName());
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                long idn = resultSet.getLong("ID");
                return  idn;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }
}
