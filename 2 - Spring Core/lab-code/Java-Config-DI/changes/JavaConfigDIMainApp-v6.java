package com.workshop.javaconfig;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDIMainApp {
  
  public static void main(String[] args) {

    // initialize IoC container with metadata from @Configuration class
    AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(MainConfig.class);
        
    
    // retrieve beans from IoC container 
    
    Student myStudent = context.getBean("highSchoolStudent", Student.class);

    CollegeStudent collegeStudent = 
        (CollegeStudent) context.getBean("collegeStudent", Student.class);

    
    System.out.println ("Output from high school student");
    myStudent.dailyActivity();

    // retrieve collections from college student
    System.out.println ("\nOutput from College student");
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

    // close the context
    context.close();
  }

}
