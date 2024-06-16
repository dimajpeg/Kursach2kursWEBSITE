package com.example.kursach.controller;

import com.example.kursach.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthorizationApiController {

    @Autowired
    private AuthorizationService authorizationService;

    @PostMapping("/signin")
    public ResponseEntity<String> signIn(@RequestParam String email, @RequestParam String password) {
        String message = authorizationService.signIn(email, password);
        if (message.equals("Sign in successful")) {
            return ResponseEntity.ok(message);
        } else {
            return ResponseEntity.badRequest().body(message);
        }
    }
}


