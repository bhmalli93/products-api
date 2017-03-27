package com.product.api.service;

import java.math.BigInteger;

import com.product.api.model.Product;

public interface ProductService {

	public Product getProduct(BigInteger productId);

	public void updatePriceByProduct(Product product);
}
