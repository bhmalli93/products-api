package com.product.api.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product.api.validator.ProductValidator;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.product.api.*")
@RestController
public class Bootstrap extends SpringServletContainerInitializer{
	
	@GetMapping(path = "/",produces={MediaType.APPLICATION_JSON_VALUE} )	
	public String sayHello(){
		
		
		return "Say Hello";
	}
	
	 public static void main(String[] args) {
	        SpringApplication.run(Bootstrap.class, args);
	    }
	 
	 @Bean
	 public Docket api() {                
	     return new Docket(DocumentationType.SWAGGER_2)          
	       .select()
	       .apis(RequestHandlerSelectors.basePackage("com.product.api.controller"))
	       .paths(PathSelectors.any())
	       .build();
	      
	 }
	  
	
	    @Bean
	    public RestTemplate getTemplate() {
	        return new RestTemplate();
	    }
	   

	   @Bean	   
	    public ProductValidator validate() {
	        return new ProductValidator();
	    }
	 
	   
}
