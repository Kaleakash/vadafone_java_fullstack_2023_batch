package com;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class DemoTest {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("File loaded successfully");
		SessionFactory sf = con.buildSessionFactory();  // It is equal to Connection in JDBC.
		Session session  = sf.openSession();			// it is equal to Statement or PreparedStatement 
		
		Transaction tran = session.getTransaction();
		
//		System.out.println("Insert Record");
//		Employee emp = new Employee();
//		emp.setId(10);
//		emp.setName("Lex");
//		emp.setSalary(28000);
//		tran.begin();
//		session.save(emp);						// insert into employee values(10,'lex',28000);
//		tran.commit();
//		System.out.println("Record inseted successfully..");
	
//		System.out.println("Delete Query");
//		Employee emp = session.get(Employee.class, 1);
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			tran.begin();
//			session.delete(emp);			// delete from employee where id = 1;
//			tran.commit();
//			System.out.println("Record deleted successfully");
//		}
		
//		System.out.println("update Query");
//		Employee emp = session.get(Employee.class, 2);
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			tran.begin();
//					emp.setSalary(34000);
//					session.update(emp);			// update employee set salary = 34000 where id=1
//			tran.commit();
//			System.out.println("Record updated successfully");
//		}
		
		System.out.println("Retrieve only one record");
	
		Employee emp = session.get(Employee.class, 2);	// select * from employee where id =2
		if(emp==null) {
			System.out.println("Record not present");
		}else {
			//System.out.println("id is "+emp.getId()+" name is"+emp.getName()+" salary is "+emp.getSalary());
			System.out.println(emp);		// internally call toString() of object. 
		}
	}

}

