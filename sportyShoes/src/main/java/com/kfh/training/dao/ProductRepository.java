package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kfh.sportyshoes.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

		Product findByName(String name);
	
	
}
