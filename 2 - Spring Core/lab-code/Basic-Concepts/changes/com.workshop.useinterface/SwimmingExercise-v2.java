package com.workshop.useinterface;

public class SwimmingExercise implements Exercise {
  
  @Override
  public void doExercise() {
	  
//	Only change here in the dependency, original class does not 
//	need to be modified
    System.out.println ("This new swimming approach is better !");
  }

}

