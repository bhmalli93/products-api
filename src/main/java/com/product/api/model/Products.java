package com.product.api.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="products")
public class Products {
	@NotNull
	private String id;
	private String name;	
	private CurrentPrice  current_price ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CurrentPrice getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(CurrentPrice current_price) {
		this.current_price = current_price;
	}
	
	
	
	

}
