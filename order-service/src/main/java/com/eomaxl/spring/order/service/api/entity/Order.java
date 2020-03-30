package com.eomaxl.spring.order.service.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_TB")
public class Order 
{
	private int id;
	private String name;
	private int qty;
	private int price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String name, int qty, int price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
