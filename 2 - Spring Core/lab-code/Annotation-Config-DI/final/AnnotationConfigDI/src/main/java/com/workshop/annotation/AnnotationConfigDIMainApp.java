package com.workshop.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigDIMainApp {
  
  public static void main(String[] args) {

    // load from XML configuration file to initialize IoC container
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beansDefinition.xml");
    
    
    System.out.println("-- Listing registered beans --");
    for (String beanName : context.getBeanDefinitionNames()) {
      System.out.println(beanName);
    }
    System.out.println("----");

    // retrieve bean from IoC container
    Student firstStudent = context.getBean("highSchoolStudent", Student.class);
    
    // call methods on the bean
    firstStudent.dailyActivity();

    // close the context
    context.close();
  }

}
