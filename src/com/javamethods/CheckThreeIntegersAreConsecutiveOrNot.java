package com.javamethods;

import java.util.Scanner;

public class CheckThreeIntegersAreConsecutiveOrNot {

	public static boolean test(int x, int y, int z) {
		int maxNum = Math.max(x, Math.max(y, z));
		int minNum = Math.min(x, Math.min(y, z));
		int middleNum = x + y + z - maxNum - minNum;
		return (maxNum - middleNum) == 1 && (middleNum - minNum == 1);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = s.nextInt();
		System.out.println("Enter the second number: ");
		int y = s.nextInt();
		System.out.println("Enter the third number: ");
		int z = s.nextInt();
		System.out.println("Check whether the three said numbers are consecutive or not!");
		System.out.println(test(x, y, z));
		s.close();
	}

}
