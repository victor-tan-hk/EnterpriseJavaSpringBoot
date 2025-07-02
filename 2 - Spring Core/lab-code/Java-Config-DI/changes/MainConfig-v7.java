package com.workshop.javaconfig;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
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
  public Exercise cyclingExercise() {
    return new CyclingExercise();
  }
  
  @Bean
  public Random getRandomGenerator() {
    Random r = new Random();
    r.setSeed(888L);
    return r;
  }
  

}