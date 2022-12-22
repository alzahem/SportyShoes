package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kfh.sportyshoes.entities.Purchases;

@Repository
public interface PurchasesRepository extends CrudRepository<Purchases, Integer>{

		Purchases findByName(String name);
	
	
}
