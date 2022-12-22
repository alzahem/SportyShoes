package com.kfh.training.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.kfh.sportyshoes.entities.User;
import com.kfh.training.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping
	Iterable<User> getAllUser(){
		return service.getAllUsers();
	}
	
	@GetMapping("users/{id}")
	Optional<User> getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	
	
	
}
