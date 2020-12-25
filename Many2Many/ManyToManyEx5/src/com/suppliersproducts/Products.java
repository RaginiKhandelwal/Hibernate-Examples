package com.suppliersproducts;

import java.util.Set;

public class Products {
	private Integer productId;
	private String productName;
	private Double price;
	private Set<Suppliers> suppliers;

	public Set<Suppliers> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Set<Suppliers> suppliers) {
		this.suppliers = suppliers;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
