package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	public String storeProduct(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			return "Product is must be unique";
		}else {
			productRepository.save(product);
			return "Product stored successfully";
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
	
	public String updateProduct(Product p) {
		Optional<Product> result = productRepository.findById(p.getPid());
		if(result.isPresent()) {
			Product product = result.get();
			product.setPname(p.getPname());
			product.setPrice(p.getPrice());
			product.setUrl(p.getUrl());
			productRepository.saveAndFlush(product);
			return "Product detaild updated successfully";
		}else {
			return "Product not present";
		}
	}
}





