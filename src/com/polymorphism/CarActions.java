package com.polymorphism;

public class CarActions extends VehicleActions {
	@Override
	public void startEngine() {
		System.out.println("Car engine started with a key!!!");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car engine stopped when the key was turned off!!!");
	}

}
