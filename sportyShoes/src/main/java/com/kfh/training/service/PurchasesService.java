package com.kfh.training.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kfh.sportyshoes.entities.Purchases;
import com.kfh.training.dao.PurchasesRepository;

@Service
public class PurchasesService {

	@Autowired
	PurchasesRepository repo;
	
	public Iterable<Purchases> getAllPurchases() {
		
		return repo.findAll();
	}

	public Optional<Purchases> getPurchasesById(int id) {
	
		return repo.findById(id);
	}

}
