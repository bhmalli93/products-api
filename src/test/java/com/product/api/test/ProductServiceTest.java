package com.product.api.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.product.api.bootstrap.Bootstrap;
import com.product.api.dao.ProductRepository;
import com.product.api.exception.Fault;
import com.product.api.model.CurrentPrice;
import com.product.api.model.ProductResponse;
import com.product.api.model.Products;
import com.product.api.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Bootstrap.class)
public class ProductServiceTest {
	
	@Autowired
    private ProductService productService;
	@Mock
	ProductRepository productRepository;
	@MockBean
	RestTemplate restTemplate;
	@MockBean
	Fault fault;
	
	Long id = (long) 13860428;
	Products product;	 	
 	CurrentPrice  currentPrice;
 	@MockBean
 	ProductResponse response;
	
	@Before
 	public void setup(){
 		product= new Products();
 		currentPrice = new CurrentPrice();
 		response = new ProductResponse();
 		/*currentPrice.setCurrency_code("USD");
 		currentPrice.setValue("13.99");
 		product.setId("13860428");
 		product.setCurrent_price(currentPrice);*/
 		
 	}
	
	 @Test
	    public void productShouldReturnFromProductService() throws Exception {
		 
		// String URI = "http://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
		 
		 product =productService.getProduct(id);
		 
		 assertEquals("13860428", product.getId());
	    }
	 
	 @Test
	    public void productShouldReturnFromProductServices() throws Exception {
		 
		 String URI = "http://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
		
	    }

	
	
	
	    
        
    

}
