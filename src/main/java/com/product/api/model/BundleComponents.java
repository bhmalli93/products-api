package com.product.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BundleComponents {
	
	private String is_assortment;

    private String is_kit_master;

	public String getIs_assortment() {
		return is_assortment;
	}

	public void setIs_assortment(String is_assortment) {
		this.is_assortment = is_assortment;
	}

	public String getIs_kit_master() {
		return is_kit_master;
	}

	public void setIs_kit_master(String is_kit_master) {
		this.is_kit_master = is_kit_master;
	}
    
    

}
