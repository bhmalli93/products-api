package com.product.api.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.api.dao.ProductRepository;
import com.product.api.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	public Product getProduct(BigInteger productId) {
		
		String id = (String)productId.toString();
		Product product = productRepository.findOne(id);
		
		return product;
	}

	public void updatePriceByProduct(Product product) {
		productRepository.save(product);
		
	}

}
