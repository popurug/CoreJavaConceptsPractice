package com.abstraction;

public class FullTimeEmployee extends Employment {
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	@Override
	public int calculateSalary() {
		return getPaymentPerHour() * 8;
	}

}
