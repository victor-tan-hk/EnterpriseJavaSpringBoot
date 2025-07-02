package com.workshop.second;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.workshop.annotation.Exercise;

@Controller
public class JoggingExercise implements Exercise {
  
  @Override
  public void doExercise() {
    System.out.println ("Jogging is fun !");
  }

}



