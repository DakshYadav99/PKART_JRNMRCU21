package com.fkart.dao;

import java.util.List;
import com.fkart.model.Product;

//Interface for the Admin DAO
public interface IAdminDao {
	boolean addProduct(Product product);
	boolean removeProduct(int productID);
	boolean updateProduct(int productID);
	Product viewProduct(int productID);
	List<Product> getAllProducts();
}
