package com;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.entity.Login;
import com.repository.LoginRepository;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
public class SpringBootBackendApplication {

	@Autowired
	LoginRepository loginRepository;
	
	
	@PostConstruct
	public void adminAccountCreate() {
		Login ll = new Login();
		ll.setEmailid("admin@gmail.com");
		ll.setPassword("admin@123");
		ll.setTypeofuser("admin");
		loginRepository.save(ll);
		System.out.println("Account created...");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
		System.out.println("spring boot backend ready");
	}

}
