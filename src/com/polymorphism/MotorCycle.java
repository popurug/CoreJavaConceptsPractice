package com.polymorphism;

public class MotorCycle extends Vehicle {
	@Override
	public void speedUp() {
		super.speedUp();
		System.out.println("\n MotorCycle speed increased by 12 units: ");
	}

}
