package com.example.ss6_demo.repository;

import com.example.ss6_demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = "select * from product",nativeQuery = true)
    List<Product> getAll();
    @Modifying
    @Transactional
    @Query(value = "delete from product where id = :id",nativeQuery = true)
     void deleteByIdProduct(int id);
    @Query(value = "INSERT INTO  product(code,cost,date,name,typeProduct) VALUES(:code,:cost,:date,:name,:typeProduct)",nativeQuery = true)
    void saveProduct(@Param("name") String name,@Param("code")String code,@Param("cost") Double cost,@Param("date")String date,@Param("typeProduct")Integer typeProduct);
}