package com.example.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
