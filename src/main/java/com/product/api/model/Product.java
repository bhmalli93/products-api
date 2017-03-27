package com.product.api.model;

public class Product {

	private Item item;

	private DeepRedLabels deep_red_labels;

	private AvailableToPromiseNetwork available_to_promise_network;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public DeepRedLabels getDeep_red_labels() {
		return deep_red_labels;
	}

	public void setDeep_red_labels(DeepRedLabels deep_red_labels) {
		this.deep_red_labels = deep_red_labels;
	}

	public AvailableToPromiseNetwork getAvailable_to_promise_network() {
		return available_to_promise_network;
	}

	public void setAvailable_to_promise_network(
			AvailableToPromiseNetwork available_to_promise_network) {
		this.available_to_promise_network = available_to_promise_network;
	}

}
