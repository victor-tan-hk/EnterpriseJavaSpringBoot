package com.workshop.demo;

import java.util.Map;
import java.util.Random;

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
	  
	  Random myRandom = context.getBean("getRandomGenerator",Random.class);
	  System.out.println ("A random number : " + myRandom.nextInt());
	  
	}

}
