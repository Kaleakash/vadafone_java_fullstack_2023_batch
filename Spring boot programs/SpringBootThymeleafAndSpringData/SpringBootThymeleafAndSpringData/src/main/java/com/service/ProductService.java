package com.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	
	public List<Product> findAllProduct(){
		return productRepository.findAll();       // pre defined method to get all products
	}
	
	public String storeProduct(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			return "Product is must be unique";
		}else {
			product.setDateInfo(LocalDate.now());
			productRepository.save(product);
			return "Product details stored successfully";
		}
	}
	
	public String deleteProduct(int pid) {
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
				productRepository.delete(p);
				return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	public String updateProduct(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			Product p = result.get();
				p.setPrice(product.getPrice());
				p.setPname(product.getPname());
				productRepository.saveAndFlush(p);
				return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public Product findProductById(int pid) {
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
			return p;
		}else {
			return null;
		}
		
	}
}
