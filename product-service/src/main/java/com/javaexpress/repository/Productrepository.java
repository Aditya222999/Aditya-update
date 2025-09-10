package com.javaexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaexpress.models.Product;

public interface Productrepository extends JpaRepository<Product, Long>{

}
