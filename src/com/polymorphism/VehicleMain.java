package com.polymorphism;

public class VehicleMain {

	public static void main(String[] args) {

		Car car = new Car();
		MotorCycle motorCycle = new MotorCycle();
		System.out.println("Car initial speed: " + car.getSpeed());
		System.out.println("MotorCycle initial speed is: " + motorCycle.getSpeed());

		car.speedUp();
		motorCycle.speedUp();

		System.out.println("\n Car speed after speeding up is: " + car.getSpeed());
		System.out.println("\n MotorCycle speed after speeding up is: " + motorCycle.getSpeed());

	}

}
