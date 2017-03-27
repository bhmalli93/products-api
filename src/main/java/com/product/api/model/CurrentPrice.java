package com.product.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="currentprice")
public class CurrentPrice {

	private String value;
	private String currencyCode;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}
