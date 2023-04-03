package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:8080/sayHello
@RequestMapping(value = "sayHello",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayHello() {
		return "Welcome to spring boot with simple rest api";
	}

}
