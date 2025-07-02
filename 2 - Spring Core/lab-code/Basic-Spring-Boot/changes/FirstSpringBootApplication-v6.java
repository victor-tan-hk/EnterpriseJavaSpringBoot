package com.workshop.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
	  
    System.out.println("----");

    // sample code to retrieve registered beans
    Student firstStudent = context.getBean("mathStudent",Student.class);
    firstStudent.dailyActivity();
    
    System.out.println("----");

	  
	}

}
