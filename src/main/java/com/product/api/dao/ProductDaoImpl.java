package com.product.api.dao;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.product.api.model.Products;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	MongoTemplate mongoTemplate;

	public Products getProduct(BigInteger productId) {
		//Query query = new Query();
		Products product = mongoTemplate.findOne(Query.query(Criteria.where("id").is(productId)), Products.class);
		return product;
	}

	
}
