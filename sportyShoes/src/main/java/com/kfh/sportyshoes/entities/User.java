package com.kfh.sportyshoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	private Integer id;

	private String name;

	private String location;

//	@JsonIgnore
//	@OneToMany(mappedBy = "user")
//	private Set<Orders> orders;
	
	public User() {

	}

	public User(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
