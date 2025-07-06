package com.di.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class OnlinePayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("Online payment is great");
		
		// TODO Auto-generated method stub

	}


}
