package com.fkart.service;

import java.util.List;

import com.fkart.model.Product;

public interface IAdminService {
	boolean addProduct(Product product);
	boolean removeProduct(int productID);
	boolean updateProduct(int productID);
	Product viewProduct(int productID);
	List<Product> getAllProducts();

}
