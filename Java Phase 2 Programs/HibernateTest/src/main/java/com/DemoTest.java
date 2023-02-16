package com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("File loaded successfully");
		SessionFactory sf = con.buildSessionFactory();  // It is equal to Connection in JDBC.
		Session session  = sf.openSession();			// it is equal to Statement or PreparedStatement 
		
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Lex");
		emp.setSalary(28000);
		
		Transaction tran = session.getTransaction();
			tran.begin();
			session.save(emp);						// insert into employee values(10,'lex',28000);
			tran.commit();
			System.out.println("Record inseted successfully..");
	}

}
