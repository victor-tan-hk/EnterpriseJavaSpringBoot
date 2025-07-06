package com.exercise.rest;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestMethodsExerciseApplication {
	
  
  @Bean 
  public ArrayList<Hero> heroes() {
  	
    ArrayList<Hero> heroList = new ArrayList<>();

    // Add 3 Hero objects with random field values
    heroList.add(new Hero("IronMan", 45, "Technology"));
    heroList.add(new Hero("Thor", 1500, "Thunder"));
    heroList.add(new Hero("SpiderMan", 18, "SpiderSense"));
    heroList.add(new Hero("WonderWoman", 33, "Lasso"));
    
    return heroList;
  	
  }
  

	public static void main(String[] args) {
		SpringApplication.run(RestMethodsExerciseApplication.class, args);
	}

}
