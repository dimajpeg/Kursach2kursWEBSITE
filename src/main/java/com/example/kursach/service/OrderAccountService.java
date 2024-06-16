package com.example.kursach.service;

import com.example.kursach.model.Order;
import com.example.kursach.repository.OrderAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderAccountService {

    private final OrderAccountRepository orderAccountRepository;

    @Autowired
    public OrderAccountService(OrderAccountRepository orderAccountRepository) {
        this.orderAccountRepository = orderAccountRepository;
    }

    public List<Order> getOrdersByEmail(String email) {
        return orderAccountRepository.findByEmail(email);
    }
}
