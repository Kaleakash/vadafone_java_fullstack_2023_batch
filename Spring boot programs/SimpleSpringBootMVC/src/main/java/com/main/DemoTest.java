package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class DemoTest {

	public static void main(String[] args) {
	SpringApplication.run(DemoTest.class, args);
	System.out.println("Spring boot up");
	}

}
