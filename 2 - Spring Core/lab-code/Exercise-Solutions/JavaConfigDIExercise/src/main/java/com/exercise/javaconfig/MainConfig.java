package com.exercise.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.exercise.javaconfig")
public class MainConfig {

	@Bean("coolPayment")
	public Payment getOnlinePayment() {
		return new OnlinePayment();
	}

	@Bean
	public Payment getDirectPayment() {
		return new DirectPayment();
	}
	
	@Primary
	@Bean 
	Payment getMobilePayment() {
		return new MobilePayment();
	}

	@Bean
	public Supermarket getSuperMarket() {
		Supermarket sm = new Supermarket(getDirectPayment());
		return sm;

	}
	

}
