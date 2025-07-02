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
    SpringApplication.run(FirstSpringBootApplication.class, args);
  }

}
