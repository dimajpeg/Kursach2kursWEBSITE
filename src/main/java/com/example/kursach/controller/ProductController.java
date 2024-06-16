package com.example.kursach.controller;

import com.example.kursach.model.Product;
import com.example.kursach.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public String searchProduct(@RequestParam String name) {
        Optional<Product> product = productService.findProductByName(name);
        return product.map(Product::getSiteName).orElse("Product not found");
    }
}
