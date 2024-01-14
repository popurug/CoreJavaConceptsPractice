package com.polymorphism;

public class Cat extends AnimalActions {
	@Override
	public void eat() {
		System.out.println("Cat drinks milk as food...");
	}

	@Override
	public void sound() {
		System.out.println("Cat makes mewow mewow!!!");
	}

}
