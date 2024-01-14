package com.polymorphism;

public class AnimalPolymorphismMain {
	public static void performAction(AnimalPolymorphism animal) {
		animal.move();
		animal.makeSound();

	}

	public static void main(String[] args) {

		AnimalPolymorphism bird = new Bird();
		AnimalPolymorphism panthera = new Panthera();

		performAction(bird);
		performAction(panthera);
	}

}
