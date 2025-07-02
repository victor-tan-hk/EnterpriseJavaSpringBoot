package com.workshop.javaconfig;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDIMainApp {
  
  public static void main(String[] args) {

    // initialize IoC container with metadata from @Configuration class
    AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(MainConfig.class);
    
    // retrieve beans from IoC container 

    System.out.println ("Retrieve by name and class type, most common approach");
    // This only exposes the methods available in the interface
    Student anyStudent = context.getBean("collegeStudent", Student.class);
    
    // This exposes all the methods available in the class
    HighSchoolStudent highSchoolStudent = context.getBean("highSchoolStudent", HighSchoolStudent.class);

    System.out.println ("Retrieve by name only which returns a type of Object");
    // we must then cast Object to either the interface or actual class type before using
    Student basicStudent = (Student) context.getBean("highSchoolStudent"); 
    CollegeStudent realStudent = (CollegeStudent) context.getBean("collegeStudent"); 
    
    
    System.out.println ("Retrieve by type only");
    // Works perfectly fine if there is only one bean of that specific type
    Student thirdStudent = context.getBean(HighSchoolStudent.class); 
    
    System.out.println ("firstExercise: Retrieve by type only");
    Exercise firstExercise = context.getBean(Exercise.class); 

    firstExercise.doExercise();


    // close the context
    context.close();
  }

}
