package com.example.cart.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.cart.feign.dao.Product;

@FeignClient(name="service-product",url="http://localhost:8081")
public interface ProductClient {

	@GetMapping("/product/{id}")
	public Product product(@PathVariable Long id);
	
	@GetMapping("/list-products")
	public List<Product> verProductos();
}
