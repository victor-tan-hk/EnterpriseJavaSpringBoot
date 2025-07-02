package com.workshop.javaconfig;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDIMainApp {
  
  public static void main(String[] args) {

    // initialize IoC container with metadata from @Configuration class
    AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(MainConfig.class);
    
    // retrieve beans from IoC container 
    SimpleCounter firstCounter = (SimpleCounter) context.getBean("simpleCounter",5);
    SimpleCounter secondCounter = (SimpleCounter) context.getBean("simpleCounter",100);
    
    firstCounter.increment();
    System.out.println (firstCounter.getMyCount());
    
    secondCounter.increment();
    System.out.println (secondCounter.getMyCount());
    
    
    // close the context
    context.close();
  }

}
