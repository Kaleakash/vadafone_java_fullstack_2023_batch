package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	// it is use to open the storeProduct.jsp 
	
	@RequestMapping(value = "openStoreProduct",method = RequestMethod.GET)
	public String openStoreProductPage() {
		return "storeProduct";
	}
	
	// store the product 
	
	@RequestMapping(value = "storeProduct",method = RequestMethod.POST)
	public String storeProductInfo(HttpServletRequest req,Product product) {
		// receive value from form and done the type casting 
		int pid = Integer.parseInt(req.getParameter("pid"));
		String pname  = req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		// set the value for entity class 
		product.setPid(pid);
		product.setPname(pname);
		product.setPrice(price);
		// class service method 
		String result = productService.storeProduct(product);
			req.setAttribute("msg", result);
		System.out.println(result);
		return "storeProduct";
	}
}
