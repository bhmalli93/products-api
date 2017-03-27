package com.product.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.product.api.model.Products;

public interface ProductRepository extends MongoRepository<Products, String>{
	
}
