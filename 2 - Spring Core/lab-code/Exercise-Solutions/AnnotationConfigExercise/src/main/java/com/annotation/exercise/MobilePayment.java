package com.annotation.exercise;

import org.springframework.stereotype.Controller;

@Controller
public class MobilePayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("mobile payment is easy");

	}


}
