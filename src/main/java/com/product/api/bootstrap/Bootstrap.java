package com.product.api.bootstrap;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.dao.ProductDao;
import com.product.api.dao.ProductRepository;
import com.product.api.model.Products;
import com.product.api.service.ProductService;
@SpringBootApplication
@RestController
@ComponentScan("com.product.api.*")
public class Bootstrap extends SpringServletContainerInitializer{
	
	@Autowired
	ProductService productService;
	@Autowired
	ProductDao productDao;
	
	@Autowired
	ProductRepository productRepository;
	 public static void main(String[] args) {
	        SpringApplication.run(Bootstrap.class, args);
	    }
	 @GetMapping("/hello")
	 public long sayHello(){
		 
		 long count =productRepository.count();		 
		 System.out.println("count is ************"+count);
		 return count;
		 
	 }
	 
	 @GetMapping(path = "/{id}",produces={MediaType.APPLICATION_JSON_VALUE} )
	 @ResponseBody
		public Products getProduct(@PathVariable BigInteger id){

			Products product = productDao.getProduct(id);
			
			return product;
		}

}
