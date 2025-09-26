package com.javaexpress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.models.Product;
import com.javaexpress.repository.Productrepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private Productrepository productrepository;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productrepository.save(product);
	}

	@Override
	public Product findById(Long product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Long product, Product productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBy(Long product) {
		// TODO Auto-generated method stub
		
	}
	
}
