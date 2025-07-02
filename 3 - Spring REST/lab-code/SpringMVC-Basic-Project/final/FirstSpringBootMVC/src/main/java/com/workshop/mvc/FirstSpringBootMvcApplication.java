package com.workshop.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootMvcApplication {

    // Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(FirstSpringBootMvcApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(FirstSpringBootMvcApplication.class, args);

		// Demonstrating log output at the 5 different log levels
		
	}

}
