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
import com.product.api.controller.ProductController;
import com.product.api.model.CurrentPrice;
import com.product.api.model.Products;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Bootstrap.class)
public class ProductControllerTest {
	
	@Autowired
	private ProductController  productController;
	
	
	
	@Test
	public void testShould_Return_BadRequest(){
	@SuppressWarnings("rawtypes")
	ResponseEntity response =	productController.getProduct(null);	
	Assert.assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());	
		
	}
	
	@Test
	public void testGetProductShouldReturn_OK(){
	@SuppressWarnings({ "rawtypes" })
	ResponseEntity response =	productController.getProduct((long) 13860428);	
	Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
	
		
	}
	
	@Test
	public void testSaveProduct_ShouldReturn_OK(){	
	Products product = new Products();
	CurrentPrice currentPrice = new CurrentPrice();
	currentPrice.setCurrency_code("USD");
	currentPrice.setValue("13.56");
	product.setId("13860428");	
	@SuppressWarnings("rawtypes")
	ResponseEntity response =	productController.updatePriceByProduct((long) 13860428, product);
	Assert.assertEquals(HttpStatus.OK, response.getStatusCode());	
	}
	@Test
	public void testSaveProduct_ShouldReturn_BadRequest(){	
	Products product = new Products();
	CurrentPrice currentPrice = new CurrentPrice();
	currentPrice.setCurrency_code("USD");
	currentPrice.setValue("13.56");
	product.setId(null);	
	@SuppressWarnings("rawtypes")
	ResponseEntity response =	productController.updatePriceByProduct(null, product);
	Assert.assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());	
	 
	
		
	}

}
