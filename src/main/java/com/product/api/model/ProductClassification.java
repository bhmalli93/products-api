package com.product.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductClassification {
	
	private String product_type_name;

    private String item_type_name;

    private String product_type;

    private ItemType item_type;

	public String getProduct_type_name() {
		return product_type_name;
	}

	public void setProduct_type_name(String product_type_name) {
		this.product_type_name = product_type_name;
	}

	public String getItem_type_name() {
		return item_type_name;
	}

	public void setItem_type_name(String item_type_name) {
		this.item_type_name = item_type_name;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public ItemType getItem_type() {
		return item_type;
	}

	public void setItem_type(ItemType item_type) {
		this.item_type = item_type;
	}
    
    

}
