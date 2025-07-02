package com.workshop.javaconfig;

import org.springframework.stereotype.Component;

public class SwimmingExercise extends Exercise {
  
  public SwimmingExercise() {
    System.out.println("SwimmingExercise created");
  }
  
  @Override
  public void doExercise() {
    super.doExercise();
    System.out.println ("Swimming is great !");
  }

}

