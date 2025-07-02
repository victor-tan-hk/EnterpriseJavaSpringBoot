package com.workshop.javaconfig;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDIMainApp {
  
  public static void main(String[] args) {

    // initialize IoC container with metadata from @Configuration class
    AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(MainConfig.class);
    
    // retrieve beans from IoC container 
    JoggingExercise jog = context.getBean("joggingExercise",JoggingExercise.class);
    CyclingExercise cycle = context.getBean("cyclingExercise",CyclingExercise.class);
    
    jog.doExercise();
    jog.doExercise();
    jog.doExercise();

    cycle.doExercise();
    cycle.doExercise();
    cycle.doExercise();
    
    // close the context
    context.close();
  }

}
