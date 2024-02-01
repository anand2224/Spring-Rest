package com.restapi.SpringRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		
		Employee e1 = new Employee(1, "anand", "a.@gmail.com", "4147372006", "chicago");
		e1.set_id(20);
		System.out.println(!e1.equals(null));
	}

}
