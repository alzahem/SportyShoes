package com.kfh.training.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kfh.sportyshoes.entities.Orders;
import com.kfh.training.service.OrderService;

@RestController
public class OrdersController {
	
	@Autowired
	OrderService service;
	
	@GetMapping
	Iterable<Orders> getAllOrder(){
		return service.getAllOrder();
	}
	
	@GetMapping("Order/{id}")
	Optional<Orders> getOrderById(@PathVariable int id) {
		return service.getOrderById(id);
	}
	
	
}
