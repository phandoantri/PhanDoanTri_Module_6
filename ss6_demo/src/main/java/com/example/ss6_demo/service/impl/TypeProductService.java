package com.example.ss6_demo.service.impl;

import com.example.ss6_demo.model.TypeProduct;
import com.example.ss6_demo.repository.ITypeProductRepository;
import com.example.ss6_demo.service.ITypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeProductService implements ITypeProductService {
    @Autowired
    private ITypeProductRepository iTypeProductRepository;

    @Override
    public List<TypeProduct> getAll() {
        return iTypeProductRepository.findAll();
    }
}
