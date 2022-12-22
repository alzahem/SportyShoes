package com.kfh.training.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.kfh.sportyshoes.entities.Purchases;
import com.kfh.training.service.PurchasesService;

@RestController
public class PurchasesController {
	
	@Autowired
	PurchasesService service;
	
	@GetMapping
	Iterable<Purchases> getAllPurchases(){
		return service.getAllPurchases();
	}
	
	@GetMapping("users/{id}")
	Optional<Purchases> getUserById(@PathVariable int id) {
		return service.getPurchasesById(id);
	}
	
	
}
