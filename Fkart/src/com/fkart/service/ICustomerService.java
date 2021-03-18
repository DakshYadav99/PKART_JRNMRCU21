package com.fkart.service;


import java.util.List;


import com.fkart.model.Cart;
import com.fkart.model.Customer;
import com.fkart.model.Product;

public interface ICustomerService {
	void addCustomer(Customer customer);
	void nonExpiredProduct(Customer Customer);
	void addCartProduct(Cart cart);
	List<Customer> getAllCustomers();
	List<Product> getAllProducts();

}
