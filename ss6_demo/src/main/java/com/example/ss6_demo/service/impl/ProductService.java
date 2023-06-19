package com.example.ss6_demo.service.impl;

import com.example.ss6_demo.model.Product;
import com.example.ss6_demo.repository.IProductRepository;
import com.example.ss6_demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return iProductRepository.getAll();
    }

    @Override
    public void delete(int id) {
        iProductRepository.deleteByIdProduct(id);
    }
}
