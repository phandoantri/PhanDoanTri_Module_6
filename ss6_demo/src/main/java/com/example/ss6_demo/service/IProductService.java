package com.example.ss6_demo.service;

import com.example.ss6_demo.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void delete(int id);

    void save(Product product);
}
