package com.exercise.javaconfig;

public class Supermarket {

	private Payment myPayment;

	public Supermarket(Payment myPayment) {
		this.myPayment = myPayment;
	}

	public Payment getMyPayment() {
		return myPayment;
	}

	public void doBusiness() {
		System.out.println("Doing business at the supermarket");
		myPayment.makePayment();
	}

}
