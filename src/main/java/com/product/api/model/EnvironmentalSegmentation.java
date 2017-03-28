package com.product.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnvironmentalSegmentation {
	
	private String is_lead_disclosure;

	public String getIs_lead_disclosure() {
		return is_lead_disclosure;
	}

	public void setIs_lead_disclosure(String is_lead_disclosure) {
		this.is_lead_disclosure = is_lead_disclosure;
	}
	
	

}
