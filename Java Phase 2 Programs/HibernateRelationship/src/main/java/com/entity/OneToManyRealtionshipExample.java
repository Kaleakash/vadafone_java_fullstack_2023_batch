package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyRealtionshipExample {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		
		// Store Trainer record 
//		Trainer t = new Trainer();
//		t.setTid(4);
//		t.setTname("Ajay");
//		t.setTech("Angular");
//		tran.begin();
//			session.save(t);
//		tran.commit();
//		System.out.println("Store trainer record");
		
		// Store student record 
//		Student s = new Student();
//		s.setSid(104);
//		s.setSname("Geeta");
//		s.setAge(27);
//			s.setTsid(4);
//		tran.begin();
//			session.save(s);
//		tran.commit();
//		System.out.println("Student record saved..");
		
		// Find trainer and associated student with that trainer 
		Trainer t = session.get(Trainer.class, 1);
		if(t==null) {
			System.out.println("No trainer present");
		}else {
			System.out.println(t);
		}
		
	}

}
