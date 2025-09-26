package com.javaexpress;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaexpress.models.Product;
import com.javaexpress.service.ProductService;

@SpringBootApplication
public class AssignmentProductApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(AssignmentProductApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Product product =new Product();
		product.setName("Aditya");
		product.setStock(1234);
		product.setDescription("dhfgkshgfgkhsfk");
		product.setPrice(BigDecimal.valueOf(19.99));
		
		
		productService.save(product);
	
	}

}
