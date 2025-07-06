package com.exercise.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WetMarket {
	
	/*
	 * There are 3 possible classes that can initialize this: 
	 * MobilePayment, DirectPayment and OnlinePayment
	 * We pick the correct bean based on @Primary annotation
	 */	  	
  @Autowired
  private Payment myPayment;

	public Payment getMyPayment() {
		return myPayment;
	}


  public void doBusiness() {
    System.out.println ("Doing business at the wet market");
    myPayment.makePayment();
  }  	


}
