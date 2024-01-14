package com.polymorphism;

public class AnimalActionsMain {

	public static void main(String[] args) {

		AnimalActions lion = new Lion();
		AnimalActions tiger = new Tiger();
		AnimalActions cat = new Cat();

		lion.eat();
		lion.sound();

		tiger.eat();
		tiger.sound();

		cat.eat();
		cat.sound();
	}

}
