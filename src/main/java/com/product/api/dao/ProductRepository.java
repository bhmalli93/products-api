package com.product.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.api.model.Products;
@Repository
public interface ProductRepository extends MongoRepository<Products, String>{

}
