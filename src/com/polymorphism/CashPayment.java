package com.polymorphism;

public class CashPayment implements Payment {

	//method overriding
	@Override
	public void pay() {
		System.out.println("This is cash payment");
	}

}
