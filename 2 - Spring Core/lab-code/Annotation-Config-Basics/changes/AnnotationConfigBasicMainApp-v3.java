package com.workshop.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigBasicMainApp {
  
  public static void main(String[] args) {

    // load from XML configuration file to initialize IoC container
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beansDefinition.xml");
    
    
    System.out.println("-- Listing registered beans --");
    for (String beanName : context.getBeanDefinitionNames()) {
      System.out.println(beanName);
    }
    System.out.println("----");


    // close the context
    context.close();
  }

}
