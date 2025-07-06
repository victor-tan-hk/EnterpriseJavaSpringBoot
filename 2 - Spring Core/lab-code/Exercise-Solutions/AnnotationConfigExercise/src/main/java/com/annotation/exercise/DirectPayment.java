package com.annotation.exercise;

import org.springframework.stereotype.Component;

@Component
public class DirectPayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("Direct payment is lousy");

	}


}
