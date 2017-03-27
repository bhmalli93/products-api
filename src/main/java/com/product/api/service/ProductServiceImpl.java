package com.product.api.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.product.api.constants.Constants;
import com.product.api.dao.ProductRepository;
import com.product.api.model.Products;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	public Products getProduct(BigInteger productId) {
		
		RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(Constants.URI, String.class);
	    
	    System.out.println("JSON **********"+result);
		
		String id = (String)productId.toString();
		Products product = productRepository.findOne(id);
		
		return product;
	}

	public void updatePriceByProduct(Products product) {
		productRepository.save(product);
		
	}

}
