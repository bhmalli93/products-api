package com.product.api.service;

import java.math.BigInteger;

import com.product.api.model.Products;

public interface ProductService {

	public Products getProduct(BigInteger productId);

	public void updatePriceByProduct(Products product);
}
