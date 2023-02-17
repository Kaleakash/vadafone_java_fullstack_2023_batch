package com.service;

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
}
