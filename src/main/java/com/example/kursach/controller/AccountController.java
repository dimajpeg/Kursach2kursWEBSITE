package com.example.kursach.controller;

import com.example.kursach.model.Order;
import com.example.kursach.service.OrderAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {

    @Autowired
    private OrderAccountService orderAccountService;

    @GetMapping("/my-account")
    public Map<String, Object> showAccountPage(@RequestParam String email) {
        List<Order> orders = orderAccountService.getOrdersByEmail(email);
        Map<String, Object> response = new HashMap<>();
        response.put("orders", orders);
        return response;
    }
}




