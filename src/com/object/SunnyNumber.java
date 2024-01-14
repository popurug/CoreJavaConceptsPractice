package com.object;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		isSunny(num);
		s.close();
	}
	
	static boolean isPerfectSquare(double num) {
		double square_root = Math.sqrt(num);
		//Whether the square root is an int or not.
		return((square_root - Math.floor(square_root)) == 0);
	}
	
	static void isSunny(int num) {
		if(isPerfectSquare(num + 1)) {
			System.out.println(num + " is a Sunny number.");
		}else {
			System.out.println(num + " is not a Sunny number.");
		}
	}
}
