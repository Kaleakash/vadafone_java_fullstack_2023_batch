package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public String openDemoPage() {
		// coding...
		return "demo";
	}
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String openLoginPage() {
		// coding...
		return "login";
	}
	
}
