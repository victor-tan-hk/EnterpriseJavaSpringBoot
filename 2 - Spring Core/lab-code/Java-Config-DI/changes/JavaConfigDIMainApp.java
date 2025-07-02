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
    Exercise  myExercise = context.getBean("swimmingExercise", Exercise.class);

    // call methods on the bean
    myExercise.doExercise();

    // close the context
    context.close();
  }

}
