package com.product.api.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
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
	
	@Autowired
	private Fault  fault;
	
	Products product;
	     
	@Test
	public void testGetProduct_NotFound(){	
	product =	productService.getProduct((long) 16483589);	
	Assert.assertEquals(HttpStatus.NOT_FOUND, fault.getCode());	
		
	}
	
	@Test
	public void testGetProduct_Found(){	
	product =	productService.getProduct((long) 13860428);	
	Assert.assertNotNull(product);
	Assert.assertEquals("USD",product.getCurrent_price().getCurrency_code());	
	Assert.assertEquals("The Big Lebowski (Blu-ray)", product.getName());	
	
		
	}

}
