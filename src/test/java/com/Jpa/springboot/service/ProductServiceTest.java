package com.Jpa.springboot.service;

import com.Jpa.springboot.dao.ProductRepository;
import com.Jpa.springboot.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductServiceTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void getAllProducts() {
        List<Product> productList = productRepository.findAll();
        assert(productList.size() > 0);
    }

    @Test
    void save() {
        Product product = new Product();
        product.setName("Redmi");
        product.setDescription("Mobile");
        Product saveProduct = productRepository.save(product);
    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
    }
}