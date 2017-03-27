package com.product.api.model;

import java.util.ArrayList;
import java.util.List;

public class AvailableToPromiseNetwork {
	
	private String availability_status;

    private String stores_available_to_promise_quantity;

    private String street_date;

    private String product_id;

    private String id_type;

    private String online_available_to_promise_quantity;

    private List<String>  multichannel_options = new ArrayList<String>();

    private String available_to_promise_quantity;

    private String availability;

	public String getAvailability_status() {
		return availability_status;
	}

	public void setAvailability_status(String availability_status) {
		this.availability_status = availability_status;
	}

	public String getStores_available_to_promise_quantity() {
		return stores_available_to_promise_quantity;
	}

	public void setStores_available_to_promise_quantity(
			String stores_available_to_promise_quantity) {
		this.stores_available_to_promise_quantity = stores_available_to_promise_quantity;
	}

	public String getStreet_date() {
		return street_date;
	}

	public void setStreet_date(String street_date) {
		this.street_date = street_date;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getId_type() {
		return id_type;
	}

	public void setId_type(String id_type) {
		this.id_type = id_type;
	}

	public String getOnline_available_to_promise_quantity() {
		return online_available_to_promise_quantity;
	}

	public void setOnline_available_to_promise_quantity(
			String online_available_to_promise_quantity) {
		this.online_available_to_promise_quantity = online_available_to_promise_quantity;
	}

	public List<String> getMultichannel_options() {
		return multichannel_options;
	}

	public void setMultichannel_options(List<String> multichannel_options) {
		this.multichannel_options = multichannel_options;
	}

	public String getAvailable_to_promise_quantity() {
		return available_to_promise_quantity;
	}

	public void setAvailable_to_promise_quantity(
			String available_to_promise_quantity) {
		this.available_to_promise_quantity = available_to_promise_quantity;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

    
    

}
