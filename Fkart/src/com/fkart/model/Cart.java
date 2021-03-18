package com.fkart.model;
import java.util.ArrayList;

//Model for the Cart containing getters ,setter and contructors
public class Cart {
	private int id;
	private ArrayList<Product> products;
	
	public Cart(){
	}
	
	public Cart(int id,ArrayList<Product> products) {
		this.id = id;
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", products=" + products + "]";
	}
	
}
