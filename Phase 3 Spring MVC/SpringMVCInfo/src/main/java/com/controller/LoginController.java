package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

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
	
	@Autowired
	LoginService loginService;			// DI for service class using auto wired 
	
	@RequestMapping(value = "signUpIntoDb",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req, Login login) {	// di for 
																// req object and login pojo 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");		// receive the value from signup page
		
		login.setEmailid(emailid);
		login.setPassword(password);					// set the value for login object 
		
		String result = loginService.signUp(login);		// call service method 
		
		System.out.println(result);						// dislay result on console 
		ModelAndView mav = new ModelAndView();
			mav.setViewName("signUp.jsp");					// redirect to same signup page. 
			mav.addObject("msg", result);		// request.setAttribute("msg",result);
		return mav;
	}
	
	@RequestMapping(value = "signInFromDb",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req, Login login) {	// di for 
																// req object and login pojo 
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");		// receive the value from signup page
		
		login.setEmailid(emailid);
		login.setPassword(password);					// set the value for login object 
		
		String result = loginService.signIn(login);		// call service method 
		System.out.println(result);

		ModelAndView mav = new ModelAndView();
		if(result.equals("success")) {
			
			mav.addObject("msg", "Welcome to home page "+emailid);
				mav.setViewName("home.jsp");
			
		}else {
			mav.addObject("msg", result);
			mav.setViewName("login.jsp");
		} 
		return mav;
	}
	@RequestMapping(value = "logout",method = RequestMethod.GET)
	public ModelAndView logOut(HttpServletRequest req) {
		req.removeAttribute("msg");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}
	
	
}
