package com.inheritance;

public class WashingMachine extends Machine {

	private String modelType = "Top Load Washing Machine";
	
	public static void main(String[] args) {
		WashingMachine washMachine = new WashingMachine();
		washMachine.wash();
		
		System.out.println(washMachine.brand + " - " + washMachine.modelType);
	}
}
