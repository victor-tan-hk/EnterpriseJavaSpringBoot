package com.workshop.setterdi;

import java.util.List;

public class HighSchoolStudent implements Student {
  
  private List<Exercise> favouriteExercises;
  
  // Setter method for DI
  public void setFavouriteExercises(List<Exercise> favouriteExercises) {
    this.favouriteExercises = favouriteExercises;
  }

  public List<Exercise> getFavouriteExercises() {
    return favouriteExercises;
  }


  @Override
  public void dailyActivity() {
    
    System.out.println ("List of favourite exercises : ");
    for (Exercise myExercise : favouriteExercises) {
      myExercise.doExercise();
    }
    System.out.println();    
    
  }

}
