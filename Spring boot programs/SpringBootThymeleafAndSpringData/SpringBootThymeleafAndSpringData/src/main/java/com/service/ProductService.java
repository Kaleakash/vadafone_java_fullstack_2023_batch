package com.service;

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
			productRepository.save(product);
			return "Product details stored successfully";
		}
		//productRepository.save(product);
	}
}
