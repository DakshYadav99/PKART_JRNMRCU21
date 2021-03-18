package com.fkart.model;

import java.util.Date;

//Model for the product model containing getters, setters and their respective contructors
public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	private Date manufactureDate;
	private Date expiryDate;
	
	public Product() {
		
	}
	
	public Product(int id,String name,double price,int quantity,Date manufactureDate,Date expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + "]";
	}
	
}
