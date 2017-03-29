package com.product.api.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	final static Logger logger = Logger.getLogger(ProductServiceImpl.class);
	
	@Autowired
	ProductRepository productRepository;
	@Autowired
	RestTemplate restTemplate;
	
	
	
	

	public ResponseEntity getProduct(Long productId) {
		Fault fault = new Fault();
		Products product = new Products();
		if(logger.isDebugEnabled()){
			logger.debug("Inside getProduct Path Param Product Id is  : " + productId);
		}
		
		String id = (String) productId.toString();
		String productName = getProductName(id,fault);
		if(productName !=null){	
			try{
				product= productRepository.findOne(id);
				logger.info("productId***"+product.getId());
			}catch(Exception ex){
				fault.setCode(HttpStatus.NOT_FOUND);
				fault.setErrorMsg(Constants.ERROR_MSG_PRICE);
				fault.setErrorReason(Constants.ERROR_MSG_PRICE);
			}			
		}
		if(product !=null){
		  product.setName(productName);
		  logger.info("productName***"+productName);
		}
		if(fault.getCode() !=null){
			return new ResponseEntity(fault, HttpStatus.OK);
		}else{
			return new ResponseEntity(product, HttpStatus.NOT_FOUND);
		}
		
	}

	private String getProductName(String productId,Fault fault) {
		String productUri =getProductURI(productId);
		logger.info("productUri*******************"+productUri);
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
	    	logger.info("*****productName*****"+productName);
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
