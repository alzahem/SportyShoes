package com.kfh.training.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.sportyshoes.entities.Orders;
import com.kfh.training.dao.OrdersRepository;

@Service
public class OrderService {

	@Autowired
	OrdersRepository repo;
	
	public Iterable<Orders> getAllOrder() {
		
		return repo.findAll();
	}

	public Optional<Orders> getOrderById(int OrderId) {
	
		return repo.findById(OrderId);
	}

}