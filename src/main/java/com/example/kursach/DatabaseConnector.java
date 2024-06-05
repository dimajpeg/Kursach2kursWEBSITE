package com.example.kursach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    static final String URL = "jdbc:mysql://127.0.0.1:3306/Clothshop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "52101215BtR";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to database successfully!");
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            throw e;
        }
        return connection;
    }

}
