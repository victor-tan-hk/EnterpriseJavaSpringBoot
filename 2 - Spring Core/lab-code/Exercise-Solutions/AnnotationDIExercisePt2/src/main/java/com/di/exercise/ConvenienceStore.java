package com.di.exercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConvenienceStore {
	
  @Value("${location}")
  private String location;

  @Value("${rating}")
  private int rating;
  
  public void showValues() {
  	System.out.println ("Welcome to the convenience store");
  	System.out.println ("Location is : " + location);
  	System.out.println ("Rating is : " + rating);
  }


}
