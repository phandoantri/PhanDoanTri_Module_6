package com.example.ss6_demo.controller;

import com.example.ss6_demo.dto.ProductDto;
import com.example.ss6_demo.model.Product;
import com.example.ss6_demo.service.IProductService;
import com.example.ss6_demo.service.ITypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private ITypeProductService iTypeProductService;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> fetchProduct() {
        List<Product> productList = this.iProductService.findAll();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable int id) {
        iProductService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/create-product")
    public ResponseEntity<Product> CreateProduct(@RequestBody Product product) {
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
