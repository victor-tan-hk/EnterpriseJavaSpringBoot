package com.annotation.exercise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigExerciseMainApp {
  
  public static void main(String[] args) {

    // load from XML configuration file to initialize IoC container
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beansAnnotationExercise.xml");
        
    // retrieve beans from IoC container
    Payment  payment1 = context.getBean("coolPayment", Payment.class);
    Payment  payment2 = context.getBean("directPayment", Payment.class);
    Payment  payment3 = context.getBean("mobilePayment", Payment.class);
    Payment  payment4 = context.getBean("bankPayment", Payment.class);
    
    // call methods on the beans
    payment1.makePayment();
    payment2.makePayment();
    payment3.makePayment();
    payment4.makePayment();

    // close the context
    context.close();
  }

}
