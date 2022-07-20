package com.example.cart.feign.dao;

public class Product {
	
private Long id;
	
	private String name;
	private String description;
	
	public Product() {
		
	}
	
	public Product(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
