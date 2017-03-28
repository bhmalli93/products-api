package com.product.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

	private TaxCategory tax_category;

    private String country_of_origin;

    private Enrichment enrichment;

    private PackageDimensions package_dimensions;

    private ProductDescription product_description;

    private Handling handling;

    private String tcin;

    private EnvironmentalSegmentation environmental_segmentation;

    private ProductClassification product_classification;

    private DisplayOption display_option;

    private String estore_item_status_code;

    private String relationship_type_code;

    private BundleComponents bundle_components;

    private String buy_url;

    private Fulfillment fulfillment;

    private RecallCompliance recall_compliance;
    
    private Manufacturer manufacturer;

    private String upc;

    private String item_state;

    private List<String> specifications = new ArrayList<String>();

    private String parent_items;

    private String subscription_eligible;

    private String return_method;    

    private ProductBrand product_brand;

    private Attributes attributes;

    private ReturnPolicies return_policies;

    private String dpci;

	public TaxCategory getTax_category() {
		return tax_category;
	}

	public void setTax_category(TaxCategory tax_category) {
		this.tax_category = tax_category;
	}

	public String getCountry_of_origin() {
		return country_of_origin;
	}

	public void setCountry_of_origin(String country_of_origin) {
		this.country_of_origin = country_of_origin;
	}

	public Enrichment getEnrichment() {
		return enrichment;
	}

	public void setEnrichment(Enrichment enrichment) {
		this.enrichment = enrichment;
	}

	public PackageDimensions getPackage_dimensions() {
		return package_dimensions;
	}

	public void setPackage_dimensions(PackageDimensions package_dimensions) {
		this.package_dimensions = package_dimensions;
	}

	public ProductDescription getProduct_description() {
		return product_description;
	}

	public void setProduct_description(ProductDescription product_description) {
		this.product_description = product_description;
	}

	public Handling getHandling() {
		return handling;
	}

	public void setHandling(Handling handling) {
		this.handling = handling;
	}

	public String getTcin() {
		return tcin;
	}

	public void setTcin(String tcin) {
		this.tcin = tcin;
	}

	public EnvironmentalSegmentation getEnvironmental_segmentation() {
		return environmental_segmentation;
	}

	public void setEnvironmental_segmentation(
			EnvironmentalSegmentation environmental_segmentation) {
		this.environmental_segmentation = environmental_segmentation;
	}

	public ProductClassification getProduct_classification() {
		return product_classification;
	}

	public void setProduct_classification(
			ProductClassification product_classification) {
		this.product_classification = product_classification;
	}

	public DisplayOption getDisplay_option() {
		return display_option;
	}

	public void setDisplay_option(DisplayOption display_option) {
		this.display_option = display_option;
	}

	public String getEstore_item_status_code() {
		return estore_item_status_code;
	}

	public void setEstore_item_status_code(String estore_item_status_code) {
		this.estore_item_status_code = estore_item_status_code;
	}

	public String getRelationship_type_code() {
		return relationship_type_code;
	}

	public void setRelationship_type_code(String relationship_type_code) {
		this.relationship_type_code = relationship_type_code;
	}

	public BundleComponents getBundle_components() {
		return bundle_components;
	}

	public void setBundle_components(BundleComponents bundle_components) {
		this.bundle_components = bundle_components;
	}

	public String getBuy_url() {
		return buy_url;
	}

	public void setBuy_url(String buy_url) {
		this.buy_url = buy_url;
	}

	public Fulfillment getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(Fulfillment fulfillment) {
		this.fulfillment = fulfillment;
	}

	public RecallCompliance getRecall_compliance() {
		return recall_compliance;
	}

	public void setRecall_compliance(RecallCompliance recall_compliance) {
		this.recall_compliance = recall_compliance;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getItem_state() {
		return item_state;
	}

	public void setItem_state(String item_state) {
		this.item_state = item_state;
	}

	public List<String> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(List<String> specifications) {
		this.specifications = specifications;
	}

	public String getParent_items() {
		return parent_items;
	}

	public void setParent_items(String parent_items) {
		this.parent_items = parent_items;
	}

	public String getSubscription_eligible() {
		return subscription_eligible;
	}

	public void setSubscription_eligible(String subscription_eligible) {
		this.subscription_eligible = subscription_eligible;
	}

	public String getReturn_method() {
		return return_method;
	}

	public void setReturn_method(String return_method) {
		this.return_method = return_method;
	}

	public ProductBrand getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(ProductBrand product_brand) {
		this.product_brand = product_brand;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	
	public String getDpci() {
		return dpci;
	}

	public void setDpci(String dpci) {
		this.dpci = dpci;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public ReturnPolicies getReturn_policies() {
		return return_policies;
	}

	public void setReturn_policies(ReturnPolicies return_policies) {
		this.return_policies = return_policies;
	}

	
    
    
    
}
