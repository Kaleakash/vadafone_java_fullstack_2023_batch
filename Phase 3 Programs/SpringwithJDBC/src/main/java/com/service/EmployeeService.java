package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired	
	EmployeeDao employeeDao;
	
	// using jdbc 
//	public String storeEmployee(Employee emp) {
//		if(emp.getSalary()<12000) {
//			return "Salary must be > 12000";
//		}else if(employeeDao.storeEmployee(emp)>0) {
//			return "Employee record stored in db successfully";
//		}else {
//			return "Record didn't store";
//		}
//	}
//	
//	public List<Employee> findAllEmployee() {
//		return employeeDao.getAllEmployeeInfo();
//	}
	
	// using jdbcTemplate 
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Salary must be > 12000";
		}else if(employeeDao.storeEmployee(emp)>0) {
			return "Employee record stored in db successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String deletEmployee(int id) {
		if(employeeDao.deleteEmployee(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String updateEmployeeSalary(Employee emp) {
		if(employeeDao.updateEmployee(emp)>0) {
			return "Employee record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	
	public List<Map<String, Object>> findAllEmployee() {
		return employeeDao.getAllEmployeeInfo();
	}
}
