package com.example.kursach;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService = new UserService();

    @PostMapping("/register")
    public String registerUser(@RequestParam String email, @RequestParam String password, @RequestParam String confirmPassword) {
        try {
            userService.registerUser(email, password, confirmPassword);
            return "User registered successfully";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        } catch (SQLException e) {
            return "Database error: " + e.getMessage();
        }
    }
}
