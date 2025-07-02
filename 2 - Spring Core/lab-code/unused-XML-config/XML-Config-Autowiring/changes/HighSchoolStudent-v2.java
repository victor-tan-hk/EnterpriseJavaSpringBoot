package com.workshop.autowiring;

public class HighSchoolStudent implements Student {
  
  private Exercise favouriteExercise;

  // Constructor for DI
  public HighSchoolStudent(Exercise favouriteExercise) {
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
