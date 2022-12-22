package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kfh.sportyshoes.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

		User findByName(String name);
	
	
}
