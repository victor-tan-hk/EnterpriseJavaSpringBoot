package com.di.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GroceryStore {
	
  @Autowired
  @Qualifier("directPayment")
  private Payment myPayment;

	public void setMyPayment(Payment myPayment) {
		this.myPayment = myPayment;
	}
	
	public Payment getMyPayment() {
		return myPayment;
	}

  public void doBusiness() {
    System.out.println ("Doing business at the grocery store");
    myPayment.makePayment();
  }  

}
