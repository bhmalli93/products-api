package com.product.api.bootstrap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.product.api.dao")
public class SpringMongoConfig extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "test";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new MongoClient("localhost", 27017);
	}
	  
	
	

}
