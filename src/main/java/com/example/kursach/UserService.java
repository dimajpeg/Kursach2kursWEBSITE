package com.example.kursach;

import java.sql.SQLException;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void registerUser(String email, String password, String confirmPassword) throws IllegalArgumentException, SQLException {
        if (!password.equals(confirmPassword)) {
            throw new IllegalArgumentException("Passwords do not match");
        }

        User existingUser = userRepository.findByEmail(email);
        if (existingUser != null) {
            throw new IllegalArgumentException("Email already registered");
        }

        User user = new User(email, password);
        userRepository.save(user);
    }
}
