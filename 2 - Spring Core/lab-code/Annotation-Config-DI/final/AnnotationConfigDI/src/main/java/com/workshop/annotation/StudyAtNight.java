package com.workshop.annotation;

import org.springframework.stereotype.Component;

//@Component
public class StudyAtNight implements Study {

  @Override
  public void studyHard() {
    System.out.println ("Studying overnight to prepare for the exams !!");
  }

}
