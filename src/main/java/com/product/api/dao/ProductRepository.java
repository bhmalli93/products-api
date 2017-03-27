package com.product.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.product.api.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
	
}
