package com.fkart.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.fkart.model.Cart;
import com.fkart.model.Customer;
import com.fkart.model.Product;
import com.fkart.service.CustomerServiceImpl;
import com.fkart.service.ICustomerService;
import com.fkart.utils.Utility;

//Customer Container Class
public class CustomerController {
	private static ICustomerService custService;
	
	public CustomerController() {
		if(null==custService) {
			custService= new CustomerServiceImpl();
		}
	}
	//custOpt() contains various operations for the customer
	public void custOpt() throws Exception{
		Scanner scanner = Utility.getScanner();
		boolean status = true;
		
		while(status) {
		System.out.println("1. Register Customer");
		System.out.println("2. Add Products in Cart");
		System.out.println("3. View Cart");
		System.out.println("4. Exit");
		int choice = scanner.nextInt();
		
		
		switch(choice) {
		case 1:
			//To Register Customer
			System.out.print("Enter id: ");
			int id = scanner.nextInt();
			System.out.print("Enter Name: ");
			String name = scanner.next();
			System.out.print("Enter Email: ");
			String email = scanner.next();
			System.out.print("Enter Phone: ");
			int phone = scanner.nextInt();
			System.out.print("Enter Address: ");
			String address = scanner.next();
			
			Customer cust = new Customer();
			cust.setId(id);
			cust.setName(name);
			cust.setEmail(email);
			cust.setPhone(phone);
			cust.setAddress(address);
			custService.addCustomer(cust);
			break;
		/*case 2:
			//To get List of Expired Products
			List<Product> allProduct = custService.getAllProducts();
			for(Product prod:allProduct) {
				if((prod.getManufactureDate()).before(prod.getExpiryDate())){
					System.out.print(prod);
				}
			}*/
		case 2:
			//To Add products in the Cart
			System.out.print("Enter Customer ID: ");
			int custID = scanner.nextInt();
			Cart cart = new Cart();
			ArrayList<Product> list = new ArrayList<Product>();
			
			 boolean stat = true;
			 while(stat) {
				 System.out.print("Enter Product ID: ");
				 int proID = scanner.nextInt();
				 System.out.print("Enter Product Name: ");
				 String proName = scanner.next();
				 System.out.print("Enter Product Price: ");
				 double price = scanner.nextDouble();
				 System.out.print("Enter Product Quantity: ");
				 int quantity = scanner.nextInt();
				 System.out.print("Enter Manufacture Date: ");
				 String manDate = scanner.next();
				 System.out.print("Enter Expiry Date: ");
				 String expDate = scanner.next();
				 
		
				 Date manufactureDate = Utility.getDate(manDate);
				 Date expiryDate = Utility.getDate(expDate);
		
				 Product addLi = new Product();
				 addLi.setId(proID);
				 addLi.setName(proName);
				 addLi.setPrice(price);
				 addLi.setQuantity(quantity);
				 addLi.setManufactureDate(manufactureDate);
				 addLi.setExpiryDate(expiryDate);
				 list.add(addLi);
				 System.out.print("Want to Add More To Cart Press 1: ");
				 int ch = scanner.nextInt();
				 if(ch==1) {
					 stat = true;
				 }
				 else {
					 stat = false;
				 }
			 }
			 cart.setId(custID);
			 cart.setProducts(list);
			 custService.addCartProduct(cart);
			break;
		case 3:
			//To get the list of all products in the cart
			List<Product> allProducts = custService.getAllProducts();
			for(Product prod:allProducts) {
				System.out.println(prod);
			}
			break;
		case 4:
			MainController main = new MainController();
			main.mainOpt();
		}
	}
		scanner.close();
}
}
