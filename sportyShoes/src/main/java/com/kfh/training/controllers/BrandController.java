package com.kfh.training.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.kfh.sportyshoes.entities.Brand;
import com.kfh.training.service.BrandService;

@RestController
public class BrandController {
	
	@Autowired
	BrandService service;
	
	@GetMapping
	Iterable<Brand> getAllBrand(){
		return service.getAllBrand();
	}
	
	@GetMapping("Brand/{id}")
	Optional<Brand> getUserById(@PathVariable int id) {
		return service.getBrandById(id);
	}
	
	
}
