package com.workshop.autowiring;

import java.util.Optional;

public class CollegeStudent implements Student {

  // Java 8 Optional: the property that can potentially
  // have a null value is declared as Optional
  private Optional<Exercise> myExercise = Optional.empty();
  

   // Setter method for DI
  public void setMyExercise(Exercise exercise) {
    this.myExercise = Optional.of(exercise);
  }


  public Exercise getMyExercise() {
    return myExercise.get();
  }

  @Override
  public void dailyActivity() {
    System.out.println ("Going to college is awesome !");
    
    // Java 8 Optional way of doing null check
    if (myExercise.isPresent()) {
      myExercise.get().doExercise();
    }
    else 
      System.out.println ("Default exercise performed. Something went wrong !");
  }
  
}
