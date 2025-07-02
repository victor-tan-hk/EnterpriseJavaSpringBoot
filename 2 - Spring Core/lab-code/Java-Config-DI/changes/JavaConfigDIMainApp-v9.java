package com.workshop.javaconfig;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDIMainApp {
  
  public static void main(String[] args) {

    // initialize IoC container with metadata from @Configuration class
    AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(MainConfig.class);
    
    // retrieve beans from IoC container 
    
    SimpleCounter firstCounter = context.getBean("simpleCounter",SimpleCounter.class);
    SimpleCounter secondCounter = context.getBean("simpleCounter",SimpleCounter.class);
    
    if (firstCounter == secondCounter) {
      System.out.println ("firstCounter and secondCounter are referencing the same object");
    }
    else 
      System.out.println ("firstCounter and secondCounter are referencing different objects");
    
    firstCounter.increment();
    firstCounter.increment();
    System.out.println (secondCounter.getMyCount());

    // close the context
    context.close();
  }

}
