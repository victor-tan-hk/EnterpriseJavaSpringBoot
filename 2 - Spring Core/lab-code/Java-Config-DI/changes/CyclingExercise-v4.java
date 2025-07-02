package com.workshop.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class CyclingExercise extends Exercise {
  
  public CyclingExercise() {
    System.out.println("CyclingExercise created");
  }
  
  @Autowired
  private SimpleCounter counter;
  
  @Override
  public void doExercise() {
    counter.increment();
    System.out.println ("Value of counter : " + counter.getMyCount());
    System.out.println ("Cycling is cool !");
  }


}
