package com.workshop.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource( {"classpath:highschool.properties", "classpath:collegestudent.properties"} )
public class MainConfig {
  
  @Bean
  public Exercise swimmingExercise() {
    return new SwimmingExercise();
  }
  
  @Bean
  public Exercise joggingExercise() {
    return new JoggingExercise();
  }
  
  @Bean
  @Primary
  public Exercise cyclingExercise() {
    return new CyclingExercise();
  }
  
  
  @Bean
  public Student highSchoolStudent() {
    HighSchoolStudent myHighSchoolStudent = new HighSchoolStudent(joggingExercise());
    return myHighSchoolStudent;
  }
  
  @Bean
  public Student collegeStudent() {
    CollegeStudent myCollegeStudent = new CollegeStudent(joggingExercise());
    return myCollegeStudent;
  }
  
  
  

}