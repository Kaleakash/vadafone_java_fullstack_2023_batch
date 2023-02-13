package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		try {
		//Class.forName("com.mysql.jdbc.Driver");		// MySQL 5.x 
		Class.forName("com.mysql.cj.jdbc.Driver");		// MySQL 8.x 
		System.out.println("Driver loaded successfully");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
