package com.object;

import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(5) + 1;
		
		System.out.println("You rolled a: " + x);
	}
}
