package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired		// spring framework search datasource details in xml file.it is byType consider 
	DataSource ds;		// before spring framework we search ds refrerence in application server
						// using jndi lookup
	public int storeEmployee(Employee emp) {
		try {
			Connection con = ds.getConnection();	
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setFloat(3, emp.getSalary());
			return ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
