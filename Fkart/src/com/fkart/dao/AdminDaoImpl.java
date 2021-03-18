package com.fkart.dao;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.Map;

import com.fkart.model.Product;
import com.fkart.utils.Utility;

//Admin Dao Implementation Layer

public class AdminDaoImpl implements IAdminDao {
	
	private static Map<Integer, Product> products = new HashMap<Integer,Product>();
	Scanner scanner = new Scanner(System.in);
	
	//To get Product object and add it in Map
	@Override
	public boolean addProduct(Product product) {
		products.put(product.getId(),product);
		System.out.println("Successfully Added");
		return true;
	}

	//To remove the product from the Map
	@Override
	public boolean removeProduct(int productID) {
		 products.remove(productID);
		 return true;
	}

	//To view the details of products
	@Override
	public Product viewProduct(int productID) {
		return products.get(productID);
	}
	
	
	//To Update the products in the Product Map
	@Override
	public boolean updateProduct(int productID) {
		System.out.print("Enter Price: ");
		double upPrice = scanner.nextDouble();
		System.out.print("Enter Price Quantity: ");
		int upQuantity = scanner.nextInt();
		System.out.print("Enter Manufacture Date: ");
		String manufactureDate = scanner.next();
		System.out.print("Enter Expiry Date: ");
		String expiryDate = scanner.next();
		Product product = products.get(productID);
		product.setPrice(upPrice);
		product.setQuantity(upQuantity);
		try {
		product.setManufactureDate(Utility.getDate(manufactureDate));
		product.setExpiryDate(Utility.getDate(expiryDate));
		}
		catch(Exception e) {
			System.out.print(e);
		}
		return true;
	}

	//To fetch the list of all products and return the list to Container Layer
	@Override
	public List<Product> getAllProducts() {
		ArrayList<Product> list = new ArrayList<Product>();
		Collection<Product> productList = products.values();
		
		for(Product product:productList) {
			list.add(product);
		}
		return list;
	}
	
}
