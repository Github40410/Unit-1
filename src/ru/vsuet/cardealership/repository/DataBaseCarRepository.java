package ru.vsuet.cardealership.repository;

import ru.vsuet.cardealership.domain.Car;
import ru.vsuet.cardealership.domain.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseCarRepository implements Repository<Car> {
    private final Connection connection;
    public DataBaseCarRepository(DataBaseConnector connector){this.connection = connector.getConnection();}

    @Override
    public Car find(Long id) {
        String query = "select * from car where id = ?";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            Car car = null;
            while (resultSet.next()) {
                long idn = resultSet.getLong("ID");
                String model = resultSet.getString("Model");
                String marka = resultSet.getString("Marka");
                car = new Car(idn, model, marka);
            }
            return car;
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }

    @Override
    public void add(Car source) {
        String query = "insert into car (model, marka) values (?, ?);";
        String model = source.getMod()+"";
        String marka = source.getMar()+"";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, model);
            statement.setString(2, marka);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }

    @Override
    public void remove(Car source) {
        String query = "delete from car where model=? and marka=?;";
        String model = source.getMod()+"";
        String marka = source.getMar()+"";
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            statement.setString(1, model);
            statement.setString(2, marka);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
    }

    @Override
    public List<Car> list() {
        String query = "select * from car;";
        List<Car> cars= new ArrayList<Car>();
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                long id = resultSet.getLong("ID");
                String model = resultSet.getString("model");
                String marka = resultSet.getString("marka");
                long idCategor = resultSet.getLong("IDType");
                Car car = new Car(id, model, marka, idCategor);
                cars.add(car);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Exception while Repository::list method call: ", e);
        }
        return cars;
    }

}