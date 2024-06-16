package com.example.kursach.repository;

import com.example.kursach.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderAccountRepository extends JpaRepository<Order, Long> {
    List<Order> findByEmail(String email);
}
