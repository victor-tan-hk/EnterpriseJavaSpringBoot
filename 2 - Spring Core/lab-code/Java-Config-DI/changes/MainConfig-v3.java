package com.workshop.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConfig {
  
  @Bean
  public Exercise swimmingExercise() {
    return new SwimmingExercise();
  }
  
  @Bean
  public Exercise joggingExercise() {
    return new JoggingExercise();
  }
  
  // Should there be a need to obtain
  // a bean of type Exercise, this
  // bean will be the chosen one
  @Bean
  @Primary
  public Exercise cyclingExercise() {
    return new CyclingExercise();
  }
  
  
  // define bean AND inject dependency 
  @Bean
  public Student collegeStudent() {
    CollegeStudent myCollegeStudent = new CollegeStudent(joggingExercise());
    return myCollegeStudent;
  }

}