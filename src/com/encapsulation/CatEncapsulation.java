package com.encapsulation;

public class CatEncapsulation {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.feed();
		cat.play();
		cat.feed();
		cat.sleep();
		
		System.out.println("The energy is: " + cat.getEnergy());
		System.out.println("The mood is: " + cat.getMood());
		System.out.println("The hungry is: " + cat.getHungry());
	}

}
