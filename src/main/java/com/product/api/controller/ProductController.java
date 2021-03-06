package com.product.api.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.exception.Fault;
import com.product.api.model.Products;
import com.product.api.service.ProductService;
import com.product.api.validator.ProductValidator;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	final static Logger logger = Logger.getLogger(ProductController.class);

	
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductValidator productValidator;	
	Products  product;
	
	@GetMapping(path = "/{id}",produces={MediaType.APPLICATION_JSON_VALUE} )
	@ApiOperation(value="",notes="this Service will fetch products price information")
	public ResponseEntity getProduct(@PathVariable(required = true) Long id){
		Fault fault;
		if(logger.isDebugEnabled()){
			logger.debug("Inside getProduct Path Param Product Id is  : " + id);
		}	
		fault = productValidator.validate(id);
		if(fault.getCode()!=null){
			return new ResponseEntity(fault, HttpStatus.BAD_REQUEST);
		}		
		ResponseEntity response = productService.getProduct(id);
		if (response != null) {
			
		} else {
			return new ResponseEntity(fault, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PutMapping(path = "/{id}",consumes={MediaType.APPLICATION_JSON_VALUE} )
	@ApiOperation(value="",notes="this Service will update products current price information")
	public ResponseEntity updatePriceByProduct(@PathVariable Long id,@RequestBody Products product){
		Fault fault;		
		if(logger.isDebugEnabled()){
			logger.debug("Path Param Inside updatePriceByProduct Method Id is  : " + id);
		}		
		fault= productValidator.validate(id,product.getId());
		if(fault.getCode()!=null){
			return new ResponseEntity(fault, HttpStatus.BAD_REQUEST);
		}		
		productService.updatePriceByProduct(product);		
		return new ResponseEntity(HttpStatus.OK);		
	}

}
