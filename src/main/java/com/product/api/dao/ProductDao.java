package com.product.api.dao;

import java.math.BigInteger;

import com.product.api.model.Products;

public interface ProductDao {
	
	public Products getProduct(BigInteger productId);

}
