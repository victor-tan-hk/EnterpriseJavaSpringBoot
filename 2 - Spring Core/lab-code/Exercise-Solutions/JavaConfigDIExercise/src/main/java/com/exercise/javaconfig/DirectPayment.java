package com.exercise.javaconfig;


public class DirectPayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("Direct payment is lousy");
	}


}
