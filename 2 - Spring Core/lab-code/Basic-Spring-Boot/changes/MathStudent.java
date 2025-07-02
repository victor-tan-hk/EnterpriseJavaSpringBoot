package com.workshop.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MathStudent implements Student {
  
  @Autowired
  @Qualifier("cyclingExercise")
  private Exercise myExercise;
  
  @Override
  public void dailyActivity() {
    System.out.println ("Doing difficult maths problems !");
    myExercise.doExercise();

  }

}
