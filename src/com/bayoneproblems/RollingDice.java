package com.bayoneproblems;

import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {

		Random rn = new Random();
		int x = rn.nextInt();
		System.out.println("You rolled a: " + x);
	}

}
