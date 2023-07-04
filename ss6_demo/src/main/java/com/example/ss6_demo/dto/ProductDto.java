package com.example.ss6_demo.dto;

import com.example.ss6_demo.model.TypeProduct;
import com.sun.istack.NotNull;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProductDto {
@NotNull
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String code;
    @NotNull
    @Min(1)
    private Double cost;
    @NotBlank
    private String date;
    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private TypeProduct typeProduct;

    public ProductDto() {
    }


    public ProductDto(int id, String name, String code, double cost, String date, TypeProduct typeProduct) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.cost = cost;
        this.date = date;
        this.typeProduct = typeProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }


}
