package com.workshop.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MathStudent implements Student {
  
  @Autowired
  @Qualifier("cyclingExercise")
  private Exercise myExercise;

  // Specify default value
  // in case my.favorite.vendor is not set
  @Value("${my.favorite.vendor:Microsoft Corp}")
  private String theVendor;
  
  @Value("${my.java.installation.directory}")
  private String theDirectory;
  
  @Value("${JAVA_HOME}")
  private String javaHomeDirect;

  
  @Override
  public void dailyActivity() {
    System.out.println ("Value of theVendor property : " + theVendor);
    System.out.println ("Value of theDirectory property : " + theDirectory);
    System.out.println ("Value of javaHomeDirect property : " + javaHomeDirect);

  }

}
