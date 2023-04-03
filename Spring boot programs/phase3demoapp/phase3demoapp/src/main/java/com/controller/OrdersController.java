package com.controller;

import java.net.http.HttpRequest;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Login;
import com.bean.Orders;
import com.bean.Product;
import com.service.OrdersService;
import com.service.ProductService;

@Controller
public class OrdersController {

	@Autowired
	ProductService productService;
	@Autowired
	OrdersService ordersService;
	
	@RequestMapping(value = "placeOrder/{pid}")
	public String placeOrder(Model mm,@PathVariable("pid") int pid,HttpSession hs,Orders order) {
		System.out.println("Pid is "+pid);
		String emailid = (String)hs.getAttribute("emailid");
		
		order.setEmailid(emailid);
		order.setOrderplaced(LocalDate.now());
		order.setProductid(pid);
		String result = ordersService.placeOrder(order);
		productService.decrementQty(pid);
		List<Product> listOfProducts = productService.findAllProduts();
		mm.addAttribute("products", listOfProducts);
		mm.addAttribute("msg", result);
		return "viewProductsByCustomer";
	}	
}
