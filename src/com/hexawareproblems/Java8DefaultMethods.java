package com.hexawareproblems;

public class Java8DefaultMethods {

	public static void main(String[] args) {

		Java8DefaultMethods m = new Java8DefaultMethods();
		Java8DefaultMethods.Car vehicle = m.new Car();
		vehicle.print();
	}
	
	class Car implements Vehicle, FourWheeler {
		public void print() {
			Vehicle.super.print();
			FourWheeler.super.print();
			Vehicle.blowHorn();
			System.out.println("I am a car!!");
		}

	}
	
}
