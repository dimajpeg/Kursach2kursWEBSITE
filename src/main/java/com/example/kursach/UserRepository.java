package com.example.kursach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    public User findByEmail(String email) throws SQLException {
        String query = "SELECT * FROM users WHERE email = ?";
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                User user = new User(resultSet.getString("email"), resultSet.getString("password"));
                user.setId(resultSet.getLong("id"));
                return user;
            } else {
                return null;
            }
        }
    }

    public void save(User user) throws SQLException {
        String query = "INSERT INTO users (email, password) VALUES (?, ?)";
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.executeUpdate();
        }
    }
}
