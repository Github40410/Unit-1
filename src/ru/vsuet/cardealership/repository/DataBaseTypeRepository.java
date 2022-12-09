package ru.vsuet.cardealership.repository;

import ru.vsuet.cardealership.domain.Car;
import ru.vsuet.cardealership.domain.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseTypeRepository implements Repository<Category>, GroupFindId<Category>, AddGroup<Car> {
    private final Connection connection;
    public DataBaseTypeRepository(DataBaseConnector connector){this.connection = connector.getConnection();}

    @Override
    public Category find(Long id) {
        String query = "select * from type where ID = ?";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            Category category = null;
            while (resultSet.next()) {
                long idn = resultSet.getLong("ID");
                String name = resultSet.getString("name");
                category = new Category(idn, name);
            }
            return category;
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }

    @Override
    public void add(Category source) {
        String query = "insert into type (name) values (?);";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, source.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }

    @Override
    public void remove(Category source) {
        String query = "delete from type where name=?;";
        String name = source.getName()+"";
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
    public List<Category> list() {
        String query = "select * from type;";
        List<Category> cars = new ArrayList<Category>();
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                long idn = resultSet.getLong("ID");
                String name = resultSet.getString("name");
                Category caregory = new Category(idn, name);
                cars.add(caregory);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
        return cars;
    }

    @Override
    public Long GetId(Category source) {
        String query = "select * from type where name = ?";
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

    @Override
    public void addVGroup(Car car, Long id) {
        String query = "insert into car (model, marka, IDType ) values (?, ?, ?);";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, car.getMod());
            statement.setString(2, car.getMar());
            statement.setLong(3, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }
}
