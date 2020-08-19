package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPostgreSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgreSqlApplication.class, args);
		System.out.println("Spring Boot with PostgreSQL Database");
	}

}
