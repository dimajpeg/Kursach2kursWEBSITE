package com.example.kursach.service;

import com.example.kursach.model.Product;
import com.example.kursach.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Optional<Product> findProductByName(String nameProduct) {
        return productRepository.findByNameProduct(nameProduct);
    }
}
