package com.workshop.setterdi;

import java.util.List;
import java.util.Map;

public class CollegeStudent implements Student {

  private List<String> favouritePlaces;
  private Map<String, Integer> subjectMarks;

  // Setter method for DI
  public void setFavouritePlaces(List<String> favouritePlaces) {
    this.favouritePlaces = favouritePlaces;
  }

  // Setter method for DI
  public void setSubjectMarks(Map<String, Integer> subjectMarks) {
    this.subjectMarks = subjectMarks;
  }

  public List<String> getFavouritePlaces() {
    return favouritePlaces;
  }

  public Map<String, Integer> getSubjectMarks() {
    return subjectMarks;
  }

  @Override
  public void dailyActivity() {
    
    System.out.println ("List of favourite places : ");
    for (String place : favouritePlaces) {
      System.out.println(place);
    }
    System.out.println();
    
    System.out.println ("List of subjects and their marks : ");
    for (String subject : subjectMarks.keySet())
      System.out.println(subject + " - " + subjectMarks.get(subject));

  }

  
}