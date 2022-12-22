package com.kfh.training.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kfh.sportyshoes.entities.Product;
import com.kfh.training.dao.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repo;
	
	public Iterable<Product> getAllProduct() {
		
		return repo.findAll();
	}

	public Optional<Product> getProductById(int productId) {
	
		return repo.findById(productId);
	}

}
