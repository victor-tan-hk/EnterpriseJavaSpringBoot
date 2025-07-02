package com.workshop.annotation.basics;

import org.springframework.stereotype.Component;

import com.workshop.annotation.Exercise;

@Component
public class CyclingExercise implements Exercise {
  
  @Override
  public void doExercise() {
    System.out.println ("Cycling is cool !");
  }


}
