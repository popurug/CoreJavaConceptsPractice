package com.polymorphism;

public class Bird extends AnimalPolymorphism {
	@Override
	public void move() {
		System.out.println("Bird flies...");
	}

	@Override
	public void makeSound() {
		System.out.println("Bird chirps...");
	}

}
