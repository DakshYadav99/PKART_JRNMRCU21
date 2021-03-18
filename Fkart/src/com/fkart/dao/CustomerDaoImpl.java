package com.fkart.dao;



import java.util.*;

import com.fkart.model.Cart;
import com.fkart.model.Customer;
import com.fkart.model.Product;


//Customer DAO implementation layer
public class CustomerDaoImpl implements ICustomerDao {
	
	private static Map<Integer,Customer> customers;
	private static HashMap<Integer,ArrayList<Product>> carts = new HashMap<Integer,ArrayList<Product>>();
	Scanner scanner = new Scanner(System.in);
	
	public CustomerDaoImpl() {
		if(null == customers) {
			customers = new HashMap<Integer,Customer>();
		}
	}

	//To Add customer details in the Customers Map
	@Override
	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
		System.out.println("Successfully Added!!");
	}

	@Override
	public void nonExpiredProduct(Customer Customer) {

	}
	
	
	//To Add Products in the cart
	@Override
	public void addCartProduct(Cart cart) {
		carts.put(cart.getId(),cart.getProducts());
		System.out.print("Successfully Added!!");
	}

	//To get the list of a particular cart
	@Override
	public List<Product> getAllProducts() {
		System.out.print("Enter Customer ID: ");
		int customerID = scanner.nextInt();
		ArrayList<Product> list = new ArrayList<Product>();
		Collection<Integer> check = carts.keySet();
		for(Integer i:check) {
			if(i.equals(customerID)) {
				
		
		Collection<ArrayList<Product>> listProduct = carts.values();
		for(ArrayList<Product> ca:listProduct) {
			list.addAll(ca);
		}
			}
		}
		return list;
		}
	
	//To get the list of all Products in cart
	@Override
	public List<Customer> getAllCustomers(){
		ArrayList<Customer> listCust = new ArrayList<Customer>();
		Collection<Customer> listCustomers = customers.values();
		for(Customer cust:listCustomers) {
			listCust.add(cust);
		}
		return listCust;
	}
	}

