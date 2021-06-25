package com.example.controller;

import com.example.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        Product p1 = new Product();
        p1.setId(UUID.randomUUID());
        p1.setName("Товар");
        p1.setDescription("Описание товара");

        return Collections.singletonList(p1);
    }

    @GetMapping("/product")
    public ResponseEntity getAllProducts() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
