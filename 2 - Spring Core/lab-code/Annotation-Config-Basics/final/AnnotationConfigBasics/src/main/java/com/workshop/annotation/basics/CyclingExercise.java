package com.workshop.annotation.basics;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.workshop.annotation.Exercise;

@Repository
public class CyclingExercise implements Exercise {
  
  @Override
  public void doExercise() {
    System.out.println ("Cycling is cool !");
  }


}
