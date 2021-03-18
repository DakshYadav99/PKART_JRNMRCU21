package com.fkart.service;


import java.util.List;

import com.fkart.dao.CustomerDaoImpl;
import com.fkart.dao.ICustomerDao;
import com.fkart.model.Cart;
import com.fkart.model.Customer;
import com.fkart.model.Product;

public class CustomerServiceImpl implements ICustomerService {
	
	private static ICustomerDao custDao;
	
	public CustomerServiceImpl() {
		if(null==custDao) {
			custDao = new CustomerDaoImpl();
		}
	}

	@Override
	public void addCustomer(Customer customer) {
		custDao.addCustomer(customer);

	}

	@Override
	public void nonExpiredProduct(Customer Customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCartProduct(Cart cart) {
		custDao.addCartProduct(cart);

	}

	@Override
	public List<Product> getAllProducts() {
		return custDao.getAllProducts();
	}
	
	@Override
	public List<Customer> getAllCustomers(){
		return custDao.getAllCustomers();
	}

}
