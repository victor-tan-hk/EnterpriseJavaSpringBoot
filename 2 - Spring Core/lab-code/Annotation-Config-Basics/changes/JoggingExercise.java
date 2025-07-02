package com.workshop.second;

import org.springframework.stereotype.Component;

import com.workshop.annotation.Exercise;

@Component
public class JoggingExercise implements Exercise {
  
  @Override
  public void doExercise() {
    System.out.println ("Jogging is fun !");
  }

}



