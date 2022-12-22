package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;

import com.kfh.sportyshoes.entities.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer>{

		Iterable<Orders> findByName(String name);
	
	
}
