package com.javaexpress.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.javaexpress.models.Product;



public interface ProductService {
	
	Product save (Product product);
	Product findById(Long product);
	Product update (Long product,Product productId);
    void deleteBy(Long product);

}
