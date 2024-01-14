package com.polymorphism;

public class VehicleActionsMain {

	public static void startAndStopEngine(VehicleActions vehicle) {
		vehicle.startEngine();
		vehicle.stopEngine();
	}

	public static void main(String[] args) {

		VehicleActions car = new CarActions();
		VehicleActions motorCycle = new MotorCycleActions();

		startAndStopEngine(car);
		startAndStopEngine(motorCycle);
	}

}
