package com.workshop.javaconfig;

import org.springframework.stereotype.Component;

public class SwimmingExercise extends Exercise {
  
  @Override
  public void doExercise() {
    super.doExercise();
    System.out.println ("Swimming is great !");
  }

}

