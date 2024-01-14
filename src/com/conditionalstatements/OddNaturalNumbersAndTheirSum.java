package com.conditionalstatements;

import java.util.Scanner;

public class OddNaturalNumbersAndTheirSum {

	public static void main(String[] args) {

		int i, n, sum = 0;
		System.out.println("Enter the number of terms is: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("\n The odd numbers are: ");

		for (i = 1; i <= n; i++) {
			System.out.println(2 * (i - 1));
			sum += 2 * (i - 1);
		}
		System.out.println("The sum of ood natural numbers upto " + n + " terms is: " + sum);
	}

}
