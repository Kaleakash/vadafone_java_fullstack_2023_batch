package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired	
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Salary must be > 12000";
		}else if(employeeDao.storeEmployee(emp)>0) {
			return "Employee record stored in db successfully";
		}else {
			return "Record didn't store";
		}
	}
}
