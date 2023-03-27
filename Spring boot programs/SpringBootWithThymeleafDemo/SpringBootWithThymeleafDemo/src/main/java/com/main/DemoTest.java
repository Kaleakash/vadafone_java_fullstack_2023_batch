package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// it scan current package 
// sub package of current package 
@SpringBootApplication(scanBasePackages = "com")
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoTest.class, args);
		System.out.println("Spring boot up");
	}

}
