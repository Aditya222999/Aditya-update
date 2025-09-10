package com.javaexpress.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.models.Product;

import com.javaexpress.repository.Productrepository;
@Service
public class ProductServiceImp implements ProductService{
	
	@Autowired
	private Productrepository productrepository;

	public Product save(Product product) {
		return productrepository.save(product);
	}

	@Override
	public Product findById(Long Id) {
		// TODO Auto-generated method stub
		Optional<Product>optional = productrepository.findById(Id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException("User Not found in DB");
		}
		
	}

	@Override
	public Product update(Integer Id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteBy(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
