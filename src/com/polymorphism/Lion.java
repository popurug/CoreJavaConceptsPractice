package com.polymorphism;

public class Lion extends AnimalActions {
	@Override
	public void eat() {
		System.out.println("Lion eats meat...");
	}
	
	@Override
	public void sound() {
		System.out.println("Lion roars...");
	}

}
