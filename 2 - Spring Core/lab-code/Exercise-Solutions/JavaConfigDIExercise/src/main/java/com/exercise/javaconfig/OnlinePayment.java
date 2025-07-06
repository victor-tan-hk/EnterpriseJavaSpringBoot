package com.exercise.javaconfig;


public class OnlinePayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("Online payment is great");
	}


}
