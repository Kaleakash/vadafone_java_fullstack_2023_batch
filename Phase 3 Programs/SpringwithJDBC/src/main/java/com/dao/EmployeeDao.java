package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

//	@Autowired		// spring framework search datasource details in xml file.it is byType consider 
//	DataSource ds;		// before spring framework we search ds refrerence in application server
//						// using jndi lookup
//	public int storeEmployee(Employee emp) {
//		try {
//			Connection con = ds.getConnection();	
//			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
//			ps.setInt(1, emp.getId());
//			ps.setString(2, emp.getName());
//			ps.setFloat(3, emp.getSalary());
//			return ps.executeUpdate();
//		}catch (Exception e) {
//			System.out.println(e);
//			return 0;
//		}
//	}
//	
//	public List<Employee> getAllEmployeeInfo() {
//		List<Employee> listOfEmp = new ArrayList<Employee>();
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement pstmt  = con.prepareStatement("select * from employee");
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//					Employee emp = new Employee();
//						emp.setId(rs.getInt(1));
//							emp.setName(rs.getString(2));
//								emp.setSalary(rs.getFloat(3));
//				listOfEmp.add(emp);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		return listOfEmp;
//	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeEmployee(Employee emp) {
	try {
return jdbcTemplate.update("insert into employee values(?,?,?)",emp.getId(),emp.getName(),emp.getSalary());
	}catch (Exception e) {
		System.out.println(e);
		return 0;
	}
	}

	public int deleteEmployee(int id) {
		try {
return jdbcTemplate.update("delete from employee where id = ?",id);
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		}
	
	
	public int updateEmployee(Employee emp) {
		try {
return jdbcTemplate.update("update employee set salary = ? where id = ?",emp.getSalary(),emp.getId());
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		}
	
	
	public List<Map<String,Object>> getAllEmployeeInfo() {
	
	try {
	return jdbcTemplate.queryForList("select * from employee");	
	} catch (Exception e) {
		System.out.println(e);
	}
	return null;
}
}
