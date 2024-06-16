package com.example.kursach.repository;

import com.example.kursach.model.AuthorizationUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorizationUserRepository extends JpaRepository<AuthorizationUser, Long> {
    Optional<AuthorizationUser> findByEmail(String email);
}


