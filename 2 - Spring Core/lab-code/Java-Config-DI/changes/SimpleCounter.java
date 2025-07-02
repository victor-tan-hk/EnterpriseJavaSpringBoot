package com.workshop.javaconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SimpleCounter {
  
  private int myCount;
  
  public SimpleCounter() {
    myCount = 0;
  }
  
  public SimpleCounter(int myCount) {
    this.myCount = myCount;
  }
  
  public void increment() {
    myCount++;
  }
  
  public int getMyCount() {
    return myCount;
  }

}
