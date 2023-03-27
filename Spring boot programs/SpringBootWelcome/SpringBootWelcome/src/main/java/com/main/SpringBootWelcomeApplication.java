package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWelcomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWelcomeApplication.class, args);
		System.out.println("Spring boot up");
	}

}
