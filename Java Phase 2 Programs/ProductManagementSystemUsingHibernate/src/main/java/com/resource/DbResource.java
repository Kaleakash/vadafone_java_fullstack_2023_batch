package com.resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbResource {

	// This method provide SessionFactory reference. 
	
	public static SessionFactory getSessionFactory() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		return con.buildSessionFactory();
	}
	
}
