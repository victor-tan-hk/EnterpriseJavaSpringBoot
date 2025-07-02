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
  
    Student firstStudent = context.getBean("highSchoolStudent",Student.class);
    firstStudent.dailyActivity();
    
    System.out.println("----");

    CollegeStudent collegeStudent = context.getBean("collegeStudent",CollegeStudent.class);
    
    System.out.println ("List of favourite places : ");
    for (String place : collegeStudent.getFavouritePlaces()) {
      System.out.println(place);
    }
    
    System.out.println ("\nList of subjects and marks : ");
    Map<String, Integer> subjectMarks = collegeStudent.getSubjectMarks();
    for (String subject : subjectMarks.keySet())
      System.out.println(subject + " - " + subjectMarks.get(subject));
    System.out.println();
    
    collegeStudent.dailyActivity();
	  
	}

}
