package com.product.api.controller;

import io.swagger.annotations.ApiOperation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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

@RestController
@RequestMapping(value="/products")
@Scope(value="request")
public class ProductController {
	
	final static Logger logger = Logger.getLogger(ProductController.class);

	
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductValidator productValidator;	
	Products  product;
	@Autowired
	Fault fault;
	@GetMapping(path = "/{id}",produces={MediaType.APPLICATION_JSON_VALUE} )
	@ApiOperation(value="",notes="this Service will fetch products price information")
	public ResponseEntity getProduct(@PathVariable(required = true) Long id){
		
		if(logger.isDebugEnabled()){
			logger.debug("Inside getProduct Path Param Product Id is  : " + id);
		}	
		fault = productValidator.validate(id);
		if(fault.getCode()!=null){
			return new ResponseEntity(fault, HttpStatus.BAD_REQUEST);
		}		
		product = productService.getProduct(id);
		if (product != null) {
			return new ResponseEntity(product, HttpStatus.OK);
		} else {
			return new ResponseEntity(fault, HttpStatus.NOT_FOUND);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PutMapping(path = "/{id}",consumes={MediaType.APPLICATION_JSON_VALUE} )
	@ApiOperation(value="",notes="this Service will update products current price information")
	public ResponseEntity updatePriceByProduct(@PathVariable Long id,@RequestBody Products product){
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
