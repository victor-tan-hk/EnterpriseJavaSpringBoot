package com.workshop.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
  
  // Bean with an explicit name
  @Bean("coolExercise")
  public Exercise swimmingExercise() {
    return new SwimmingExercise();
  }
  
  // Bean with a default name
  // which is the name of the method itself
  @Bean
  public Exercise getMeTheExerciseNow() {
    return new JoggingExercise();
  }
  
  // Bean with a default name
  // which is the name of the method itself

  @Bean
  public Student collegeStudent() {
    // inject dependency by directly calling another bean method
    CollegeStudent myCollegeStudent = new CollegeStudent(getMeTheExerciseNow());
    return myCollegeStudent;
  }

}