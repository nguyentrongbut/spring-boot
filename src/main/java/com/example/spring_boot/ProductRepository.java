package com.example.spring_boot;

import org.springframework.data.jpa.repository.JpaRepository;

//model
public interface ProductRepository extends JpaRepository<Product, Long> {

}
