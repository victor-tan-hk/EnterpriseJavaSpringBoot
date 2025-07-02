package com.workshop.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDIMainApp {
  
  public static void main(String[] args) {

    // initialize IoC container with metadata from @Configuration class
    AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(MainConfig.class);

    System.out.println("-- Listing registered beans --");
    for (String beanName : context.getBeanDefinitionNames()) {
      System.out.println(beanName);
    }
    System.out.println("----");
        
    // retrieve beans from IoC container
    Student myStudent = context.getBean("collegeStudent", Student.class);
    Exercise specificExercise = context.getBean("swimmingExercise", Exercise.class);
    
    // There are 3 classes that implement the interface Exercise
    // In order to decide which one to obtain, use the @Primary
    // to mark the class of choice
    // so we will obtain cyclingExercise
    Exercise  anyExercise = context.getBean(Exercise.class);
    
    // call methods on the beans
    specificExercise.doExercise();
    anyExercise.doExercise();
    myStudent.dailyActivity();

    // close the context
    context.close();
  }

}
