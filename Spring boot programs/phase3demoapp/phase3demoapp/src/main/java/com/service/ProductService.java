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
	
	public String storeProduct(Product product) {
		productRepository.save(product);
		return "Product details stored successfully";
	}
	
	public List<Product> findAllProduts() {
		return productRepository.findAll();
	}
	
	public void decrementQty(int pid) {
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
			p.setQty(p.getQty()-1);
			productRepository.saveAndFlush(p);	// like update 
		}
	}
}
