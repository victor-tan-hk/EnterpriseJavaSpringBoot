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
    Exercise  firstExercise = context.getBean("getMeTheExerciseNow", Exercise.class);
    Exercise  secondExercise = context.getBean("coolExercise", Exercise.class);
    
    Student myStudent = context.getBean("collegeStudent", Student.class);

    // call methods on the beans
    firstExercise.doExercise();
    secondExercise.doExercise();

    myStudent.dailyActivity();

    // close the context
    context.close();
  }

}
