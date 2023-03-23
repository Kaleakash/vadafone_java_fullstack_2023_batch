package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
	public ModelAndView checkLoginDetails(HttpServletRequest req) { // di for request object 
		
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		
		ModelAndView mav = new ModelAndView();
		
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
}
