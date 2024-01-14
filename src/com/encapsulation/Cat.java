package com.encapsulation;

public class Cat {
	private int mood = 50;
	private int hungry = 60;
	private int energy = 70;

	public void sleep() {
		System.out.println("This is sleep method....");
		energy++;
		hungry++;
	}

	public void play() {
		System.out.println("This is play method....");
		mood++;
		energy--;
		meow();
	}

	public void feed() {
		System.out.println("This is feed method...");
		hungry--;
		mood++;
		meow();
	}

	private void meow() {
		System.out.println("This is meow method....");
	}

	public int getMood() {
		return mood;
	}

	public int getHungry() {
		return hungry;
	}

	public int getEnergy() {
		return energy;
	}

}
