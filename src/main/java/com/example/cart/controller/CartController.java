package com.example.cart.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cart.feign.client.ProductClient;
import com.example.cart.feign.dao.Product;

@RestController
public class CartController {
	
	@Autowired
	private ProductClient productClient;
	
	@GetMapping("/cart")
	public String cart() {
		return "Hola Mundo!";
	}
	
	@GetMapping("/list-products")
	public List<Product> listProducts(){
		return productClient.verProductos();
	}

}
