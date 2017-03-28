package com.product.api.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.client.RestTemplate;

import com.product.api.exception.Fault;
@SpringBootApplication
@ComponentScan("com.product.api.*")
public class Bootstrap extends SpringServletContainerInitializer{
	
	 public static void main(String[] args) {
	        SpringApplication.run(Bootstrap.class, args);
	    }
	
	   @Bean
	    public Fault fault() {
	        return new Fault();
	    }
	 
	   @Bean
	    public RestTemplate getTemplate() {
	        return new RestTemplate();
	    }
}
