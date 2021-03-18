package com.fkart.service;

import java.util.List;

import com.fkart.dao.AdminDaoImpl;
import com.fkart.dao.IAdminDao;
import com.fkart.model.Product;

//Admin Service Layer
public class AdminServiceImpl implements IAdminService {
	
	private static IAdminDao adminDao;
	
	public AdminServiceImpl() {
		adminDao = new AdminDaoImpl();
	}

	//Call to Admin DAO to add new product
	@Override
	public boolean addProduct(Product product) {
		adminDao.addProduct(product);
		return true;
	}

	//Call to Admin DAO to remove the product
	@Override
	public boolean removeProduct(int productID) {
		adminDao.removeProduct(productID);
		return true;

	}
	
	//Call to Admin DAO to update the Product
	
	@Override
	public boolean updateProduct(int productID) {
		adminDao.updateProduct(productID);
		return true;
	}
	
	//Call to Admin DAO to view particular product

	@Override
	public Product viewProduct(int productID) {
		return adminDao.viewProduct(productID);
	}

	//Call to Admin DAO to view all the products
	@Override
	public List<Product> getAllProducts() {
		return adminDao.getAllProducts();
	}
	

}
