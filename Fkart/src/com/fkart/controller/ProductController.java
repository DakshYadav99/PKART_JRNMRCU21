package com.fkart.controller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.fkart.model.Product;
import com.fkart.service.AdminServiceImpl;
import com.fkart.service.IAdminService;
import com.fkart.utils.Utility;


//Admin Controller Class
public class ProductController {
	
	private static IAdminService service;
	
	public ProductController() {
		if(null==service) {
			service = new AdminServiceImpl();
		}
	}
	//adminOpt() methods contains the various options for the Admin Container
	public void adminOpt() throws Exception{
		boolean status = true;
		Scanner scanner = Utility.getScanner();
		while(status) {
		
		
		System.out.println("1. Add Products");
		System.out.println("2. Remove Product");
		System.out.println("3. Update Product");
		System.out.println("4. View Product");
		System.out.println("5. View All Products");
		System.out.println("6. Exit");
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		//Case 1 is for Adding Products
		case 1:
			System.out.print("Enter Product ID: ");
			int id = scanner.nextInt();
			System.out.print("Enter Product Name: ");
			String productName = scanner.next();
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
			
			Product product = new Product();
			product.setId(id);
			product.setName(productName);
			product.setPrice(price);
			product.setQuantity(quantity);
			product.setManufactureDate(manufactureDate);
			product.setExpiryDate(expiryDate);
			service.addProduct(product);
			break;
		case 2:
			//Case 2 is for removing the Product
			System.out.print("Enter Product ID: ");
			int productID = scanner.nextInt();
			service.removeProduct(productID);
			break;
		case 3:
			//Case 3 is for updating the product
			System.out.print("Enter Product ID: ");
			int prodId = scanner.nextInt();
			service.updateProduct(prodId);
			break;
			
		case 4:
			//Case 4 is for View a particular product by entering Product ID
			System.out.print("Enter Product ID: ");
			int prodID = scanner.nextInt();
			Product view = service.viewProduct(prodID);
			System.out.print(view);
			break;
		case 5:
			// Case 5 is to display all the product in the list entered by the Admin
			List<Product> allProduct = service.getAllProducts();
			for(Product disp:allProduct) {
				System.out.println(disp);
			}
			break;
		case 6:
			// Case 6 is going back to the Main Controller
			MainController main = new MainController();
			main.mainOpt();
			break;
		}
		}	
		scanner.close();
	}
}
