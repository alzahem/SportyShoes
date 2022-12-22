package com.kfh.training.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.kfh.sportyshoes.entities.Product;
import com.kfh.training.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	Iterable<Product> getAllProduct(){
		return service.getAllProduct();
	}
	
	@GetMapping("Product/{Id}")
	Optional<Product> getProductById(@PathVariable int Id) {
		return service.getProductById(Id);
	}
	
	
}
