package com.employee.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSearchServiceApplication.class, args);
	}

}
