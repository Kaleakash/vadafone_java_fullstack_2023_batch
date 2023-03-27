package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openPage(Model mm) {
		mm.addAttribute("name", "Akash Kale");   // request.setAttribute("msg",
		return "index";
	}
}
