package com.workshop.demo;

import org.springframework.stereotype.Component;

@Component
public class CyclingExercise implements Exercise {
  
  @Override
  public void doExercise() {
    System.out.println ("Cycling is cool !");
  }


}
