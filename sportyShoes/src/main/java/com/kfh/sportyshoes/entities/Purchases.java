package com.kfh.sportyshoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Purchases {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer PurchasesId;
	
	private Integer Quantity;

	@ManyToOne
	private Product product;
	private Orders order;
	
	public Purchases(Integer purchasesId, Integer quantity, Product product, Orders order) {
		super();
		PurchasesId = purchasesId;
		Quantity = quantity;
		this.product = product;
		this.order = order;
	}

	public Integer getPurchasesId() {
		return PurchasesId;
	}

	public void setPurchasesId(Integer purchasesId) {
		PurchasesId = purchasesId;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	
	
}
