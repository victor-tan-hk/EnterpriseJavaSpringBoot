package com.di.exercise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDIExerciseMainApp {
  
  public static void main(String[] args) {

    // load from XML configuration file to initialize IoC container
    ClassPathXmlApplicationContext context = 
        new ClassPathXmlApplicationContext("beansAnnotationExercise.xml");
        
    // retrieve beans from IoC container
    Supermarket sm = context.getBean("supermarket", Supermarket.class);
    GroceryStore gs = context.getBean("groceryStore", GroceryStore.class);
    WetMarket wm = context.getBean("wetMarket", WetMarket.class);
    
    // call methods on the beans
    sm.doBusiness();
    gs.doBusiness();
    wm.doBusiness();
    

    // close the context
    context.close();
  }

}
