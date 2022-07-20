package com.example.cart.model;

import java.util.List;

import com.example.cart.feign.dao.Product;

public class Cart {
	
	private List<Product> listaProdcutos;

	public Cart(List<Product> listaProdcutos) {
		super();
		this.listaProdcutos = listaProdcutos;
	}

	public List<Product> getListaProdcutos() {
		return listaProdcutos;
	}

	public void setListaProdcutos(List<Product> listaProdcutos) {
		this.listaProdcutos = listaProdcutos;
	}
	
	

}
