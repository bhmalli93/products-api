package com.product.api.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.model.Products;
import com.product.api.service.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(path = "/{id}",produces={MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity getProduct(@PathVariable BigInteger id){

		Products product = productService.getProduct(id);
		if(product!=null){
		return new ResponseEntity(product, HttpStatus.OK);
		}
		else{
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping(path = "/{id}",consumes={MediaType.APPLICATION_JSON_VALUE} )
	public void updatePriceByProduct(@PathVariable BigInteger id,@RequestBody Products product){

		productService.updatePriceByProduct(product);
		
	}

}
