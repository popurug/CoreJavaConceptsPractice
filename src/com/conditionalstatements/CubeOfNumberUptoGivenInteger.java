package com.conditionalstatements;

import java.util.Scanner;

public class CubeOfNumberUptoGivenInteger {

	public static void main(String[] args) {

		int i, n;
		System.out.println("Input the number of terms: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.println("Number is: " + i + " and cube of " + i + " is: " + (i * i * i));
		}
		s.close();
	}

}
