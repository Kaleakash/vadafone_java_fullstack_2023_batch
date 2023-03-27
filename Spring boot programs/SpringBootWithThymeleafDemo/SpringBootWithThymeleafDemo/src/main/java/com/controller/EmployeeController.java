package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Employee;

@Controller
public class EmployeeController {
	
	//http://localhost:8080/addEmployee
	// set object using model reference method 
//	@RequestMapping(value = "addEmployee",method = RequestMethod.GET)
//	public String addEmployee(Model mm,Employee emp) {  // DI for model and employee 
//		// @ModelAttribute() 	
//		mm.addAttribute("employee", emp);    //	set employee object in model scope 
//		return "addEmployee";
//	}
	
	// set the value using annotation 
	@RequestMapping(value = "addEmployee",method = RequestMethod.GET)
	public String addEmployee(@ModelAttribute() Employee employee) {  // DI for model and employee 
		// @ModelAttribute() 	
		//mm.addAttribute("employee", emp);    //	set employee object in model scope 
		return "addEmployee";
	}
	
	@RequestMapping(value = "saveEmployee",method = RequestMethod.GET)
	public String saveEmployee(Model mm, Employee emp) {  // DI for model and employee 
			System.out.println(emp);
		return "addEmployee";
	}
	
	//http://localhost:8080/displayEmployee

	@RequestMapping(value = "displayEmployee",method = RequestMethod.GET)
	public String displayEmployeeInfo(Model mm) {
		
		List<Employee> al = new ArrayList<>();
		al.add(new Employee(1, "Ravi", 12000));
		al.add(new Employee(2, "Ramesh", 14000));
		al.add(new Employee(3, "Lokesh", 16000));
		
		mm.addAttribute("employees", al);
		return "displayEmployee";				// view page name (thymeleaf)
	}
}
