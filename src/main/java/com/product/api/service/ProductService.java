package com.product.api.service;

import com.product.api.model.Products;

public interface ProductService {

	public Products getProduct(Long productId);

	public void updatePriceByProduct(Products product);
}
