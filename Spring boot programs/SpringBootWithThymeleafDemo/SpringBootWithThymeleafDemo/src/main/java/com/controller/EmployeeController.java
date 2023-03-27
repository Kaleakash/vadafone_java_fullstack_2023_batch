package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.bean.Employee;

@Controller
public class EmployeeController {

	
	public String displayEmployeeInfo(Model mm) {
		List<Employee> al = new ArrayList<>();
		al.add(new Employee(1, "Ravi", 12000));
		al.add(new Employee(2, "Ramesh", 14000));
		al.add(new Employee(3, "Lokesh", 16000));
		
		mm.addAttribute("employees", al);
		return "displayEmployee";
	}
}
