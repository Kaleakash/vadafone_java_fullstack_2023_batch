package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Employee;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp =new Employee();
//		emp.display();

		Resource res = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		Employee emp1 = (Employee)bf.getBean("emp1");
		emp1.display();
	}

}
