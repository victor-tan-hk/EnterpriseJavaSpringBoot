package com.di.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Supermarket {
	
  private Payment myPayment;

	@Autowired
  public Supermarket(Payment myPayment) {
    this.myPayment = myPayment;
  }
	
  public Payment getMyPayment() {
		return myPayment;
	}

  public void doBusiness() {
    System.out.println ("Doing business at the supermarket");
    myPayment.makePayment();
  }


}
