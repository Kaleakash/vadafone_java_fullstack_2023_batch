package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String storeProduct(Model mm,Product product) {
		
		String result = productService.storeProduct(product);
		List<Product> listOfProduct = productService.findAllProduct();
		mm.addAttribute("msg", result);
		mm.addAttribute("products", listOfProduct);
		mm.addAttribute("product", product);
		return "index";
	}
	

	@RequestMapping(value = "/deleteProduct/{pid}",method = RequestMethod.GET)
	public String deleteProduct(@PathVariable("pid") int pid, Model mm,Product product) { // DI for Product 
		
		String result = productService.deleteProduct(pid);
		mm.addAttribute("msg", result);
		List<Product> listOfProduct = productService.findAllProduct();
		mm.addAttribute("products", listOfProduct);	// store listof product with name as products
		mm.addAttribute("product", product);		// store product object with name product 
		return "index";
	}
	
	
	@RequestMapping(value = "/openUpdateForm/{pid}",method = RequestMethod.GET)
	public String openUpdateForm(@PathVariable("pid") int pid, Model mm) { // DI for Product 
		Product product = productService.findProductById(pid);
		mm.addAttribute("product", product);		// store product object with name product 
		return "update";
	}
	
	@RequestMapping(value = "updateProduct",method = RequestMethod.POST)
	public String updateProduct(Model mm,Product product) {
//		order.setPrice(product.getPrice());
//		order.setProductname(product.getPname());
//		order.setQty(10);
//		order.setCustomername("akash@gmail.com");
		
		String result = productService.updateProduct(product);
		List<Product> listOfProduct = productService.findAllProduct();
		mm.addAttribute("msg", result);
		mm.addAttribute("products", listOfProduct);
		mm.addAttribute("product", product);
		return "index";
	}
	
}
