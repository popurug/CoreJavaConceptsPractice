package com.polymorphism;

public class Dog extends AnimalSounds {

	public void Sound() {
		System.out.println("The dog says : bow bow");
	}
	
	public void Sound(String angry) {
		System.out.println("The dog says : growl growl");
		super.Sound();
	}
}
