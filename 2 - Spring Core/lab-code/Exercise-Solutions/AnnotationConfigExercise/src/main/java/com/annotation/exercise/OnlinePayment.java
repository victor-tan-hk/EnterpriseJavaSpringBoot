package com.annotation.exercise;

import org.springframework.stereotype.Component;

@Component("coolPayment")
public class OnlinePayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("Online payment is great");
		
		// TODO Auto-generated method stub

	}


}
