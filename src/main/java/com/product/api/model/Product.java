package com.product.api.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="products")
public class Product {
	@NotNull
	private BigInteger id;
	private String name;	
	private CurrentPrice  currentPrice ;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CurrentPrice getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(CurrentPrice currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	
	

}
