package com.example.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvc.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
