package ru.vsuet.cardealership.repository;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {
    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/cardealership";
    private static final String DATABASE_NAME = "root";
    private static final String DATABASE_PASSWORD ="root";

    private final Connection connection;
    public DataBaseConnector(){
        try{
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_NAME, DATABASE_PASSWORD);
            DatabaseMetaData dmd = connection.getMetaData();
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}