package com.ordering_system.customer_ordering_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class CustomerOrderingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrderingSystemApplication.class, args);

		LocalDateTime current=LocalDateTime.now();
		System.out.println(current);
	}

}
