package com.javamethods;

import java.util.Scanner;

public class AcceptThreeIntegersAndReturnMiddleOne {

	public static boolean test(int x, int y, int z) {
		int max = Math.max(x, Math.max(y, z));
		int min = Math.min(x, Math.min(y, z));
		double midPoint1 = (max + min) / 2.0;
		int midPoint2 = x + y + z - max - min;
		return (midPoint1 == midPoint2);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int x = s.nextInt();
		System.out.println("Input the second number: ");
		int y = s.nextInt();
		System.out.println("Input the third number: ");
		int z = s.nextInt();
		System.out.println("Check whether the three said numbers has a midpoint!!\n");
		System.out.println(test(x, y, z));
		s.close();
	}

}
