package com.javaexpress.service;

import org.springframework.stereotype.Service;

import com.javaexpress.models.Product;

@Service
public interface ProductService {
	
	Product save(Product product);
	Product findById(Long Id);
	Product update(Integer Id,Product product);
	Product deleteBy(Long Id);

}
