package com.polymorphism;

public class Car extends Vehicle {
	@Override
	public void speedUp() {
		super.speedUp();
		System.out.println("\n Car speed increased by 22 units: ");
	}

}
