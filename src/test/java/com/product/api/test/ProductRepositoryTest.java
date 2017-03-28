package com.product.api.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.product.api.bootstrap.Bootstrap;
import com.product.api.controller.ProductController;
import com.product.api.dao.ProductRepository;
import com.product.api.model.CurrentPrice;
import com.product.api.model.Products;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Bootstrap.class)
public class ProductRepositoryTest {
	
	 	@Autowired
	    private ProductController productController;
	 	
	 	@Autowired
	    private ProductRepository productRepository;	 	
	 	
	 	private Products product;	
	 	
	 	private CurrentPrice currentPrice;	
	 	 
	 	 
	 	 
	 	 @Test
	     public void testSaveProductById() throws Exception {
	 		product = new Products();
	 		currentPrice = new CurrentPrice();
	 		currentPrice.setCurrency_code("USD");
	 		currentPrice.setValue("13.49");
	 		product.setId("13860428");
	 		product.setCurrent_price(currentPrice);
	 		product = this.productRepository.save(product);	 		
	 		assertEquals("13860428", product.getId());
	 		assertEquals("13.49", product.getCurrent_price().getValue());
	     }
	 	 
	 	@Test
	     public void testGetProductById() throws Exception {	         
	 		product = this.productRepository.findOne("13860428");
	 		assertNotNull(product);
	 		assertEquals("13860428", product.getId());
	 		assertEquals("13.49", product.getCurrent_price().getValue());
	     }

	 	 
	 	 

		
}