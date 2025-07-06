package com.exercise.javaconfig;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigExerciseMainApp {
  
  public static void main(String[] args) {

    // initialize IoC container with metadata from @Configuration class
    AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(MainConfig.class);
    
    Payment pay1 = context.getBean("coolPayment",Payment.class);
    pay1.makePayment();
    
    Payment pay2 = context.getBean(Payment.class);
    pay2.makePayment();
    
    Supermarket sm = context.getBean("getSuperMarket",Supermarket.class);
    WetMarket wm = context.getBean("wetMarket",WetMarket.class);
    
    sm.doBusiness();
    wm.doBusiness();

    // close the context
    context.close();
  }

}
