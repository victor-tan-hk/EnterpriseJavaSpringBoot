package com.workshop.configxml;

public class SwimmingExercise implements Exercise {
  
  private String swimmingTechnique;
  
  public SwimmingExercise(String swimmingTechnique) {
    this.swimmingTechnique = swimmingTechnique;
  }
  
  @Override
  public void doExercise() {
    System.out.println ("Swimming is great !");
  }

}

