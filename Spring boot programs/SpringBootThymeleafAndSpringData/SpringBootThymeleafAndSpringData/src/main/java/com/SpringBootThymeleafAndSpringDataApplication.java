package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com") // all anntoation @Controller, @Service, @Repository 
@EntityScan(basePackages = "com.entity")   // entity scan 
@EnableJpaRepositories(basePackages = "com.repository")
public class SpringBootThymeleafAndSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafAndSpringDataApplication.class, args);
		System.out.println("Spring boot up!");
	}

}
