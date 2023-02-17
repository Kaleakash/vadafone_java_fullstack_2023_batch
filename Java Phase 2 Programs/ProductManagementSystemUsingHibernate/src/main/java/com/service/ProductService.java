package com.service;

import java.util.List;

import com.dao.ProductDao;
import com.entity.Product;

public class ProductService {

	ProductDao pd = new ProductDao();
	public String storeProduct(Product product) {
		if(product.getPrice()<500) {
			return "Product price must > 500";
		}else {
			if(pd.storeProduct(product)>0) {
				return "Product stored successfully";
			}else {
				return "Product didn't store";
			}
		}
	}
	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product deleted";
		}else {
			return "Product not deleted";
		}
	}
	
	public String incrementProductPrice(Product product) {
		if(pd.incrementProductPrice(product)>0) {
			return "Product price incremented";
		}else {
			return "Product not deleted";
		}
	}
	
	public String decrementProductPrice(Product product) {
		if(pd.decrementProductPrice(product)>0) {
			return "Product price decrement";
		}else {
			return "Product not deleted";
		}
	}
	
	public String findProduct(int pid) {
		Product pp = pd.findProductById(pid);
		if(pp==null) {
			return "Product not present";
		}else {
			return pp.toString();
		}
	}
	
	public List<Product> findAllProduct() {
		return pd.findProductAllProduct();
	}
	
}
