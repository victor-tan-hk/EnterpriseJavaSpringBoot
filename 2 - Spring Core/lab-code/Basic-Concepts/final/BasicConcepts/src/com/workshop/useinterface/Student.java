package com.workshop.useinterface;


public class Student {
  
  Exercise myFavouriteExercise;
  
  public Student() {
	// Only change a single statement in the constructor
	// to reflect a change in the exercise functionality
    myFavouriteExercise = new JoggingExercise();
  }
  
  public void doSomeExercises() {
    // 100 lines of code which uses this statement below
	// No change necessary here in this statement 
	// which makes maintenance much more easier
    myFavouriteExercise.doExercise();
  }
  
  public static void main(String[] args) {
    
    Student myStudent = new Student();
    myStudent.doSomeExercises();

  }

}


