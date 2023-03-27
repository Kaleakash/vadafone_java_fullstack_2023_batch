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
	public String allProduct(Model mm) {
		List<Product> listOfProduct = productService.findAllProduct();
		System.out.println("size "+listOfProduct.size());
		mm.addAttribute("products", listOfProduct);
		return "index";
	}
}
