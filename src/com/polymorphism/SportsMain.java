package com.polymorphism;

public class SportsMain {

	public static void main(String[] args) {

		Sports sports = new Sports();
		Football football = new Football();
		Basketball basketball = new Basketball();
		Rugby rugby = new Rugby();

		sports.play();
		football.play();
		basketball.play();
		rugby.play();
	}

}
