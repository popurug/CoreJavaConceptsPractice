package com.polymorphism;

public class Panthera extends AnimalPolymorphism {
	@Override
	public void move() {
		System.out.println("Panthera walks...");
	}

	@Override
	public void makeSound() {
		System.out.println("Panthera roars...");
	}

}
