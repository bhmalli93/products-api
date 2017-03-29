package com.product.api.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.product.api.bootstrap.Bootstrap;
import com.product.api.exception.Fault;
import com.product.api.model.Products;
import com.product.api.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Bootstrap.class)
public class ProductServiceTest {
	
	@Autowired
    private ProductService productService;
	
	
	Fault  fault = new Fault();
	
	Products product= new Products();
	     
	@Test
	public void testGetProduct_NotFound(){	
	ResponseEntity response =	productService.getProduct((long) 16483589);	
	Assert.assertEquals(HttpStatus.NOT_FOUND, fault.getCode());	
		
	}
	
	@Test
	public void testGetProduct_Found(){	
	ResponseEntity response =	productService.getProduct((long) 13860428);	
	Assert.assertNotNull(response);	
	Assert.assertEquals(product,response.hasBody());	
	Assert.assertEquals("The Big Lebowski (Blu-ray)", product.getName());	
	
		
	}

}
