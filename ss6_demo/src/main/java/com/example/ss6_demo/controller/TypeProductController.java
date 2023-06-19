package com.example.ss6_demo.controller;

import com.example.ss6_demo.model.TypeProduct;
import com.example.ss6_demo.service.ITypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TypeProductController {
    @Autowired
    private ITypeProductService iTypeProductService;
    @GetMapping("/type")
    public ResponseEntity<List<TypeProduct>> showListType(){
        List<TypeProduct> typeProductList=iTypeProductService.getAll();
        if (typeProductList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(typeProductList,HttpStatus.OK);
    }

}
