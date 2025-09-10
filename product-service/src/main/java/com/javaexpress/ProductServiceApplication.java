package com.javaexpress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaexpress.models.Product;
import com.javaexpress.service.ProductService;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner{

	@Autowired
	private ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		Product product = new Product();
		product.setName("Yuva");
		product.setDescription("Yuvahiwbrgkjerhgifh");
		product.setStock(10);
	}

}
