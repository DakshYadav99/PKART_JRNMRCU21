package com.fkart.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fkart.model.Product;
import com.fkart.service.AdminServiceImpl;
import com.fkart.service.IAdminService;

class AdminDaoImplTest {
	
	private static IAdminService adminService;

	@BeforeEach
	void setUp() throws Exception {
		adminService = new AdminServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("ABC");
		product.setPrice(12);
		product.setQuantity(1);
		product.setExpiryDate(null);
		product.setManufactureDate(null);
		boolean status = adminService.addProduct(product);
		assertEquals(true,status);
		
	}

	@Test
	void testRemoveProduct() {
		assertEquals(true,adminService.removeProduct(1));
	}

	@Test
	void testViewProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("ABC");
		product.setPrice(12);
		product.setQuantity(1);
		product.setExpiryDate(null);
		product.setManufactureDate(null);
		adminService.addProduct(product);
		int id = product.getId();
		assertEquals(1,id);
	}

	@Test
	void testUpdateProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("ABC");
		product.setPrice(12);
		product.setQuantity(1);
		product.setExpiryDate(null);
		product.setManufactureDate(null);
		adminService.addProduct(product);
		assertEquals(true,adminService.updateProduct(1));
	}

	@Test
	void testGetAllProducts() {
		Product product = new Product();
		product.setId(1);
		product.setName("ABC");
		product.setPrice(12);
		product.setQuantity(1);
		product.setExpiryDate(null);
		product.setManufactureDate(null);
		adminService.addProduct(product);
		List<Product> pro = adminService.getAllProducts();
		for(Product p:pro) {
			assertEquals(1,p.getId());
		}
	}

}
