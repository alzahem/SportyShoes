package com.kfh.sportyshoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer brandId;
	
	private String brandName;
	
	public Brand() {
		
	}
	
	public String getBrand() {
		return brandName;
	}
	
}
