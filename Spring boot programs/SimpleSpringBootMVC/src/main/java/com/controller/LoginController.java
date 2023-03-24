package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value="checkLogin",
			method = RequestMethod.POST)
	public String checkloginInfo(HttpServletRequest req) {
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			return "home";
		}else {
			return "failure";
		}
	}
}
