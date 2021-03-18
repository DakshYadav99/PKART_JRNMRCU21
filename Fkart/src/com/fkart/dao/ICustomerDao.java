package com.fkart.dao;

import java.util.List;

import com.fkart.model.Cart;
import com.fkart.model.Customer;
import com.fkart.model.Product;

//Interface for the Customer DAO
public interface ICustomerDao {
	void addCustomer(Customer customer);
	void nonExpiredProduct(Customer Customer);
	void addCartProduct(Cart cart);
	List<Customer> getAllCustomers();
	List<Product> getAllProducts();
}
