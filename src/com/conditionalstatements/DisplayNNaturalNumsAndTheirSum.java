package com.conditionalstatements;

import java.util.Scanner;

public class DisplayNNaturalNumsAndTheirSum {

	public static void main(String[] args) {

		int i, n, sum = 0;
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter input number: ");
			n = s.nextInt();
			s.close();
		}
		System.out.println("The first n natural numbers are: " + n);

		for (i = 1; i <= n; i++) {
			System.out.println(i);
			System.out.println("**********");
			System.out.println(sum);
			sum += i;
		}
		System.out.println("The sum of Natural Number upto " + n + " terms: " + sum);

	}

}
