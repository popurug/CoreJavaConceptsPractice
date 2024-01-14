package com.polymorphism;

public class Tiger extends AnimalActions {
	@Override
	public void eat() {
		System.out.println("Tiget eats meat and sometimes fish...");
	}

	@Override
	public void sound() {
		System.out.println("Tiger growls...");
	}

}
