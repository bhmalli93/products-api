package com.product.api.dao;

import java.math.BigInteger;

import com.product.api.model.Product;

public interface ProductDao {
	
	public Product getProduct(BigInteger productId);

}
