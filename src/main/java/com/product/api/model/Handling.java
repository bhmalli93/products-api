package com.product.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Handling {
	
	 private String import_designation_description;

	public String getImport_designation_description() {
		return import_designation_description;
	}

	public void setImport_designation_description(
			String import_designation_description) {
		this.import_designation_description = import_designation_description;
	}
	 

}
