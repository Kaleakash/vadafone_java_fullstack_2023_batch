package com.main;

import com.entity.Product;
import com.service.ProductService;

public class App {

	public static void main(String[] args) {
		ProductService ps = new ProductService();
		Product p = new Product();
		p.setPname("Computer");
		p.setPrice(45000);
		String result = ps.storeProduct(p);
		System.out.println(result);

	}

}
