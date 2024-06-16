package com.example.kursach.service;

import com.example.kursach.model.AuthorizationUser;
import com.example.kursach.repository.AuthorizationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorizationService {

    @Autowired
    private AuthorizationUserRepository userRepository;

    public String signIn(String email, String password) {
        Optional<AuthorizationUser> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            AuthorizationUser user = userOptional.get();
            if (user.getPassword().equals(password)) {
                return "Sign in successful";
            } else {
                return "Invalid password";
            }
        } else {
            return "User not found";
        }
    }
}
