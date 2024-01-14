package com.object;

public class RunningMain {
     private static Car1 car;
     private static Bike1 bike;
     
	public static void main(String[] args) {
		
		Car1 car = new Car1();
		Bike1 bike = new Bike1();
		bike.kick();
		car.key();
	}
}
