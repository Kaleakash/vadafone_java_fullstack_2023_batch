package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	//DispatcherServlet
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("I came here");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		return mav;
	}
}
