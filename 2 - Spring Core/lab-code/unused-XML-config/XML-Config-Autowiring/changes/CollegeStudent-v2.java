package com.workshop.autowiring;

public class CollegeStudent implements Student {

  private Exercise myExercise;

   // Setter method for DI
  public void setMyExercise(Exercise myExercise) {
    this.myExercise = myExercise;
  }


  public Exercise getMyExercise() {
    return myExercise;
  }

  @Override
  public void dailyActivity() {
    System.out.println ("Going to college is awesome !");
    
    // Traditional way of performing null check
    if (myExercise != null) 
      myExercise.doExercise();
    else 
      System.out.println ("Default exercise performed. Something went wrong !");
  }
  
}
