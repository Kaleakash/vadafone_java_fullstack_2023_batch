package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String allProduct(Model mm,Product product) { // DI for Product 
	List<Product> listOfProduct = productService.findAllProduct();
		System.out.println("size "+listOfProduct.size());
		mm.addAttribute("products", listOfProduct);	// store listof product with name as products
		mm.addAttribute("product", product);		// store product object with name product 
		return "index";
	}
	
	@RequestMapping(value = "saveProduct",method = RequestMethod.POST)
	public String storeProdut(Model mm,Product product) {
		
	//System.out.println(product);
		String result = productService.storeProduct(product);
		List<Product> listOfProduct = productService.findAllProduct();
		mm.addAttribute("msg", result);
		mm.addAttribute("products", listOfProduct);
		mm.addAttribute("product", product);
		return "index";
	}

}
