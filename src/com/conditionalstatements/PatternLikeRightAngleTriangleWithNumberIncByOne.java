package com.conditionalstatements;

import java.util.Scanner;

public class PatternLikeRightAngleTriangleWithNumberIncByOne {

	public static void main(String[] args) {

		int i, j, n, k = 1;
		System.out.println("Input number of rows: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" " + k++);
			}
			System.out.println("");
		}
	}

}
