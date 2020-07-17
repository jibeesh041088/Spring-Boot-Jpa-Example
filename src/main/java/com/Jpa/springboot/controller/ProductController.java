package com.Jpa.springboot.controller;

import com.Jpa.springboot.entity.Product;
import com.Jpa.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public List<Product> product() {
        return productService.getAllProducts();
    }
}
