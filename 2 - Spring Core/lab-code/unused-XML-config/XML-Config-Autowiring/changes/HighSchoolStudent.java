package com.workshop.autowiring;

public class HighSchoolStudent implements Student {
  
  private Exercise favouriteExercise;

  // Setter method for DI
  public void setMyExercise(Exercise favouriteExercise) {
    this.favouriteExercise = favouriteExercise;
  }
  
  public Exercise getFavouriteExercise() {
    return favouriteExercise;
  }

  @Override
  public void dailyActivity() {
    System.out.println ("Going to high school is boring !");
    favouriteExercise.doExercise();
  }


}
