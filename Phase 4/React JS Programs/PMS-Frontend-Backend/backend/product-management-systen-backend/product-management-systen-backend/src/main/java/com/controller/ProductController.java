package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/findAllProduct
	@GetMapping(value = "findAllProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProducts() {
		return productService.findAllProduct();
	}
	
	// http://localhost:8080/storeProduct 
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		System.out.println(product); // call toString method
		return productService.storeProduct(product);
	}
	//http://localhost:8080/deleteProduct/1
	//http://localhost:8080/deleteProduct/100
	
	@DeleteMapping(value = "deleteProduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid) {
		
		return productService.deleteProduct(pid);
	}
	
	// http://localhost:8080/storeProduct 
		@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateProduct(@RequestBody Product product) {
			System.out.println(product); // call toString method
			return productService.updateProduct(product);
		}
}




