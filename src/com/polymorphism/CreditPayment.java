package com.polymorphism;

public class CreditPayment implements Payment {
	
	//method overriding
	@Override
	public void pay() {
		System.out.println("This is credit card payment");
	}

}
