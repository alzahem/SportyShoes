package com.kfh.training.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kfh.sportyshoes.entities.Brand;
import com.kfh.training.dao.BrandRepository;

@Service
public class BrandService {

	@Autowired
	BrandRepository repo;
	
	public Iterable<Brand> getAllBrand() {
		
		return repo.findAll();
	}

	public Optional<Brand> getBrandById(int id) {
	
		return repo.findById(id);
	}

}
