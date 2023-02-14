package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		
		if(emp.getSalary()>12000) {
				
				if(ed.storeEmployee(emp)>0) {
					return "Record insered in database";
				}else {
					return "Record didn't insert";
				}
				
		}else {
			return "Salary must be >12000";
		}
	}
}
