package com.example.Spring2Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.Spring2Demo.repo")
@EntityScan("com.example.Spring2Demo.persistence")
@SpringBootApplication
public class Spring2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2DemoApplication.class, args);
	}

}
