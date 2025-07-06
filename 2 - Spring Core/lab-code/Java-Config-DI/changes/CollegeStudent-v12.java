package com.workshop.javaconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CollegeStudent implements Student {

  @Autowired
  @Qualifier("swimmingExercise")
  private Exercise myExercise;
  
  // Using a SPEL expression
  @Value("#{'${favourite.places}'.split(',')}") 
  private List<String> favouritePlaces;
  
  // Using a SPEL expression
  @Value("#{${subject.marks}}")
  private Map<String, Integer> subjectMarks;  

  public CollegeStudent() {
    System.out.println("CollegeStudent created");
  }
  
  public void setFavouritePlaces(List<String> favouritePlaces) {
    this.favouritePlaces = favouritePlaces;
  }

  public void setSubjectMarks(Map<String, Integer> subjectMarks) {
    this.subjectMarks = subjectMarks;
  }

  public List<String> getFavouritePlaces() {
    return favouritePlaces;
  }

  public Map<String, Integer> getSubjectMarks() {
    return subjectMarks;
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
