package com.di.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WetMarket {
	
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
