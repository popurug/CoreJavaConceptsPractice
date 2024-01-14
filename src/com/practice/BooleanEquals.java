package com.practice;

import java.util.Scanner;

public class BooleanEquals {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your percentage");
		Double d1 = scanner.nextDouble();
		Boolean b1 = true;
		Boolean b2 = false;
		
		if(d1>64) {
			b2= true;
		}
		if(b1.equals(b2)) {
			System.out.println("Congratulation! you have passed with flying colours.");
		}else {
			double d2 = 64.0-d1;
			System.out.println("Sorry! You have failed. You needed "+d2+" more marks to pass.\nTry again next year.");
		}
	}
}
