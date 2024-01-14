package com.conditionalstatements;

import java.util.Scanner;

public class PatternLikeRightAngleTriangleWithANumber {

	public static void main(String[] args) {

		int i, j, n;
		System.out.println("Enter input number of rows: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println("");
		}
	}

}
