package com.product.api.bootstrap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.product.api.dao")
public class SpringMongoConfig extends AbstractMongoConfiguration{
	
	@Value("${mongodb.host}")	
	private String mongoHost;
	
	@Value("${mongodb.port}")	
	private int mongoPort;
	
	@Value("${mongodb.database}")	
	private String database;

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return database;
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new MongoClient(mongoHost, mongoPort);
	}
	  
	
	

}
