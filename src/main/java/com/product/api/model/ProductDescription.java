package com.product.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDescription {
	
	 private String title;

	 private String general_description;

	 private List<String> bullet_description = new ArrayList<String>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGeneral_description() {
		return general_description;
	}

	public void setGeneral_description(String general_description) {
		this.general_description = general_description;
	}

	public List<String> getBullet_description() {
		return bullet_description;
	}

	public void setBullet_description(List<String> bullet_description) {
		this.bullet_description = bullet_description;
	}
	 
	 

}
