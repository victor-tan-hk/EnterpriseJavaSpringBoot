package com.workshop.annotation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HighSchoolStudent implements Student {
  
  @Autowired
  private Exercise myExercise;
  
  // Java 8 Optional: the property that can potentially
  // have a null value is declared as Optional
  @Autowired
  private Optional<Study> myStudy;
  
  @Value("${myHighSchool}")
  private String highSchoolName;

  @Value("${myAge}")
  private int age;
  
  public Exercise getMyExercise() {
    return myExercise;
  }

  public String getHighSchoolName() {
    return highSchoolName;
  }
  
  public int getAge() {
    return age;
  }

  @Override
  public void dailyActivity() {
    System.out.println ("Going to high school : " + highSchoolName);
    System.out.println ("My age is : " + age);    
    myExercise.doExercise();
    // Java 8 Optional way of doing null check
    if (myStudy.isPresent()) {
      myStudy.get().studyHard();
    }
    else 
      System.out.println ("Default study is performed. Something went wrong !");
  }


}
