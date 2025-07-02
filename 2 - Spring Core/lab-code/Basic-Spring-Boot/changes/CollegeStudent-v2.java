package com.workshop.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CollegeStudent implements Student {

  @Autowired
  @Qualifier("joggingExercise")
  private Exercise myExercise;
  
  // Using a SPEL expression
  @Value("#{'${favourite.places}'.split(',')}") 
  private List<String> favouritePlaces;


  public void setFavouritePlaces(List<String> favouritePlaces) {
    this.favouritePlaces = favouritePlaces;
  }

  public List<String> getFavouritePlaces() {
    return favouritePlaces;
  }
 
  public Exercise getMyExercise() {
    return myExercise;
  }

  @Override
  public void dailyActivity() {
    System.out.println ("Going to college : ");
    myExercise.doExercise();
  }

  
}
