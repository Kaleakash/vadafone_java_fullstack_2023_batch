package com;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

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
		
//		System.out.println("Retrieve only one record");
//	
//		Employee emp = session.get(Employee.class, 2);	// select * from employee where id =2
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			//System.out.println("id is "+emp.getId()+" name is"+emp.getName()+" salary is "+emp.getSalary());
//			System.out.println(emp);		// internally call toString() of object. 
//		}
		
		
//		System.out.println("Retrieve all property of entity class");
//		//Query qry  =  session.createQuery("select e from Employee e");
//		//Query qry  =  session.createQuery("from Employee e");
//		Query qry  =  session.createQuery("from Employee");
//		List<Employee> listOfEmp =qry.list();
//		System.out.println("Number of records are "+listOfEmp.size());
		
//		System.out.println("Retrieve all property of entity class");
//		TypedQuery<Employee> tq = session.createQuery("select e from Employee e");
//		List<Employee> listOfEmp = tq.getResultList();
//		System.out.println("Number of records are "+listOfEmp.size());
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp = li.next();
//			System.out.println(emp);   // it call toString method
//		}
		
		//System.out.println("Retrieve all property of entity class with condition");
	//TypedQuery<Employee> tq = session.createQuery("select e from Employee e where e.id=2");
	//TypedQuery<Employee> tq = session.createQuery("select e from Employee e where e.name='Lex' ");
	//TypedQuery<Employee> tq = session.createQuery("select e from Employee e where e.salary > 20000 ");
		
//TypedQuery<Employee> tq = session.createQuery("select e from Employee e where e.id=:eid "); //:id is label
//tq.setParameter("eid", 2);
		
//		TypedQuery<Employee> tq = session.createQuery("select e from Employee e where e.name=:ename "); //:ename is label
//		tq.setParameter("ename", "Lex");
		
//TypedQuery<Employee> tq = 
//session.createQuery("select e from Employee e where e.salary > :esalary "); //:esalary is label
//tq.setParameter("esalary", 20000f);
//
//		List<Employee> listOfEmp = tq.getResultList();
//		System.out.println("Number of records are "+listOfEmp.size());
//		Iterator<Employee> li = listOfEmp.iterator();
//		while(li.hasNext()) {
//			Employee emp = li.next();
//			System.out.println(emp);   // it call toString method
//		}
		
//System.out.println("retreive only name - partial objet");	
//TypedQuery<String> tq = session.createQuery("select e.name from Employee e"); //:esalary is label
//				
//	List<String> listOfEmp = tq.getResultList();
//	System.out.println("Number of records are "+listOfEmp.size());
//	Iterator<String> li = listOfEmp.iterator();
//				while(li.hasNext()) {
//					String name = li.next();
//					System.out.println(name);   
//				}
		
//		System.out.println("retreive only id - partial objet");	
//		TypedQuery<Integer> tq = session.createQuery("select e.id from Employee e"); //:esalary is label
//						
//			List<Integer> listOfEmp = tq.getResultList();
//			System.out.println("Number of records are "+listOfEmp.size());
//			Iterator<Integer> li = listOfEmp.iterator();
//						while(li.hasNext()) {
//							int id = li.next();
//							System.out.println(id);   
//						}
		
//System.out.println("retreive only id - name - partial objet");	
//TypedQuery<Object[]> tq = session.createQuery("select e.id,e.name from Employee e"); //:esalary is label
//		List<Object[]> listOfEmp = tq.getResultList();
//		System.out.println("Number of records are "+listOfEmp.size());
//		Iterator<Object[]> li = listOfEmp.iterator();
//					while(li.hasNext()) {
//					Object obj[] = li.next();
//					System.out.println(" id is "+obj[0]+" name is "+obj[1]);   
//				}
		
System.out.println("sql query using hibernate ");	
TypedQuery<Object[]> tq = session.createSQLQuery("select * from sample");
	List<Object[]> listOfEmp = tq.getResultList();
			Iterator<Object[]> li = listOfEmp.iterator();
					while(li.hasNext()) {
					Object obj[] = li.next();
							System.out.println(" id is "+obj[0]+" name is "+obj[1]);   
					}
	}  

}

