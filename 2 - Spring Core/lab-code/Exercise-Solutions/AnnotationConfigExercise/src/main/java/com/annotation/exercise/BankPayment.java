package com.annotation.exercise;

import org.springframework.stereotype.Service;

@Service
public class BankPayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("bank payment requires queuing");

	}


}
