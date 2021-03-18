package com.fkart.controller;

import java.util.Scanner;

import com.fkart.utils.Utility;

//Main Controller Class

public class MainController {
	public static void main(String args[])	{
		try {
			mainOpt();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	//Method contains the options for Admin Container and Customer Container
	static void mainOpt() throws Exception{
		Scanner scanner = Utility.getScanner();
		boolean status = true;
		
		while(status) {
		ProductController adContain = new ProductController();
		CustomerController custCont = new CustomerController();
		
		System.out.println("<---Welcome to FKart--->"+"\n"+"Press"+"\n");
		System.out.println("1. Admin");
		System.out.println("2. Customer");
		System.out.println("3. Exit");
		int choice = scanner.nextInt();
		if(choice>3) {
			System.out.print("No Such Option Exists");
		}
		
		switch(choice) {
		case 1:adContain.adminOpt();
		break;
		case 2: custCont.custOpt();
		break;
		case 3:
			System.out.println("Exiting Fkart Console");
			status = false;
		}
		}
		scanner.close();
	}
}

