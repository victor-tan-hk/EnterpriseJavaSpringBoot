package com.workshop.demo;

import java.util.Map;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/*
 * Remember that @SpringBootApplication is a combination of 
@ComponentScan
@Configuration
@EnableAutoConfiguration
*/

@SpringBootApplication
public class FirstSpringBootApplication {
  

	public static void main(String[] args) {
	  ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
	  
	  Student myStudent = context.getBean("mathPerson",Student.class);
	  myStudent.dailyActivity();
	  
	}
	


}
