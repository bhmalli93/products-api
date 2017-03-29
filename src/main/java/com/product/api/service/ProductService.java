package com.product.api.service;

import org.springframework.http.ResponseEntity;

import com.product.api.model.Products;

public interface ProductService {

	public ResponseEntity getProduct(Long productId);

	public void updatePriceByProduct(Products product);
}
