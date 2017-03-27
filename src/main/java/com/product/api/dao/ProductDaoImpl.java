package com.product.api.dao;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.product.api.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	MongoTemplate mongoTemplate;

	public Product getProduct(BigInteger productId) {
		//Query query = new Query();
		Product product = mongoTemplate.findOne(Query.query(Criteria.where("id").is(productId)), Product.class);
		return product;
	}

	
}
