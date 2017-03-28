package com.product.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.product.api.constants.Constants;
import com.product.api.dao.ProductRepository;
import com.product.api.exception.Fault;
import com.product.api.model.ProductResponse;
import com.product.api.model.Products;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	Fault fault;

	public Products getProduct(Long productId) {
		Products product=null;
		String id = (String) productId.toString();
		String productName = getProductName(id);
		if(productName !=null){		
			product= productRepository.findOne(id);
		}
		if(product !=null){
		  product.setName(productName);
		}else{
			fault.setCode(HttpStatus.NOT_FOUND);
			fault.setErrorMsg(Constants.ERROR_MSG_PRICE);
			fault.setErrorReason(Constants.ERROR_MSG_PRICE);
		}
		return product;
	}

	private String getProductName(String productId) {
		
		String productUri =getProductURI(productId);
		System.out.println("*******************"+productUri);
		String productName = null;
		ProductResponse result=null;
		try{		
			result = restTemplate.getForObject(productUri, ProductResponse.class);
		} catch (HttpClientErrorException ex) {			
			fault.setCode(ex.getStatusCode());
			fault.setErrorMsg(Constants.ERROR_MSG);
			fault.setErrorReason(Constants.ERROR_MSG);			
		}
	    
	    if(result != null){
	    	productName = result.getProduct().getItem().getProduct_description().getTitle();	    	
	    	System.out.println("*****productName*****"+productName);
		}

		return productName;
	}

	private String getProductURI(String productId) {
		StringBuilder url = new StringBuilder(Constants.URI);
		url.append(productId);
		url.append("/");
		url.append("?excludes=");
		url.append(Constants.TAXONOMY);
		url.append(",");
		url.append(Constants.PRICE);
		url.append(",");
		url.append(Constants.PROMOTION);
		url.append(",");
		url.append(Constants.BULKSHIP);
		url.append(",");
		url.append(Constants.RATING_AND_REVIEWS);
		url.append(",");
		url.append(Constants.RATING_AND_REVIEWS_STAT);
		url.append(",");
		url.append(Constants.QUESTION_ANSWAR_STAT);
		
		return url.toString();
	}

	public void updatePriceByProduct(Products product) {
		productRepository.save(product);
		
	}

}
