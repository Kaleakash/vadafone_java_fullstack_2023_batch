package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.MyConfiguration;
import com.pojo.Employee;

public class DemoTest {

	public static void main(String[] args) {
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp = (Employee)ac.getBean("employee");
//		System.out.println(emp);
//		emp.setId(100);
//		emp.setName("Ravi");
//		emp.setSalary(12000);
//		System.out.println(emp);
		
		
		AnnotationConfigApplicationContext ac = 
				new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(12000);
		System.out.println(emp);
	}

}
