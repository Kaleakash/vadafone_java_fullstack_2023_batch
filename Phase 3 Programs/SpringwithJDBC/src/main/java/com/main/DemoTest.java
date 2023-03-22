package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {

ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	// insert Query using jdbc 
//	Employee emp = (Employee)ac.getBean("employee");
//	emp.setId(1);
//	emp.setName("Leena");
//	emp.setSalary(13000);
//	
//	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//	
//	String result = es.storeEmployee(emp);
//	System.out.println(result);

	// Retrieve Query using jdbc 
//	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//	List<Employee> listOfEmp = es.findAllEmployee();
//	Iterator<Employee> li = listOfEmp.iterator();
//	while(li.hasNext()) {
//		Employee e = li.next();
//		System.out.println(e);
//	}

	
//insert Query using jdbctemplate  
//	Employee emp = (Employee)ac.getBean("employee");
//	emp.setId(11);
//	emp.setName("Veena");
//	emp.setSalary(13000);
//	
//	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//	
//	String result = es.storeEmployee(emp);
//	System.out.println(result);
	
	// retrieve query using jdbcTemplate
//EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//	List<Map<String, Object>> mm = es.findAllEmployee();
//	Iterator<Map<String, Object>> li = mm.iterator();
//	while(li.hasNext()) {
//		Map<String, Object> m = li.next();
//		System.out.println(m);
//	}
	
	//Delete query using jdbcTemplate 
//	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//	String result = es.deletEmployee(1);
//	System.out.println(result);

	// Update Query 
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	Employee emp = (Employee)ac.getBean("employee");
	emp.setId(2);
	emp.setSalary(40000);
	String result = es.updateEmployeeSalary(emp);
	System.out.println(result);
	}

}
