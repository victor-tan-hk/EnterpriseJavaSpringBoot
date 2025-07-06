package com.exercise.javaconfig;


public class MobilePayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("mobile payment is easy");
	}


}
