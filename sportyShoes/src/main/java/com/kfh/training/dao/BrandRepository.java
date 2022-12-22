package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kfh.sportyshoes.entities.Brand;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer>{

		Brand findByName(String name);
	
	
}
