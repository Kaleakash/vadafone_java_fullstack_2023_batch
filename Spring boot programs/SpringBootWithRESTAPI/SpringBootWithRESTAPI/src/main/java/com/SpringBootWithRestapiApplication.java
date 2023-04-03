package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootWithRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRestapiApplication.class, args);
		System.out.println("Spring boot with rest api up");
	}

}
