package com.service;

import java.util.List;

import com.dao.ProductDao;
import com.entity.Product;

public class ProductService {

	ProductDao pd  = new ProductDao();
	
	public String storeProduct(Product product) {
		if(pd.storeProduct(product)>0) {
			return "Product data stored successfully";
		}else {
			return "Product details didn't store";
		}
	}
	
	public List<Product> findAllProduct() {
		return pd.findAllProduct();
	}
}
