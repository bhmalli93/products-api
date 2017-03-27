package com.product.api.model;

import java.util.ArrayList;
import java.util.List;

public class Enrichment {
	
	 private List<Images> images = new ArrayList<Images>();

	 private List<SalesClassificationNodes>  sales_classification_nodes = new ArrayList<SalesClassificationNodes>();

	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public List<SalesClassificationNodes> getSales_classification_nodes() {
		return sales_classification_nodes;
	}

	public void setSales_classification_nodes(
			List<SalesClassificationNodes> sales_classification_nodes) {
		this.sales_classification_nodes = sales_classification_nodes;
	} 
	 
	 
	 

}
