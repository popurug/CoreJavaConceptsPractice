package com.arrays;

import java.util.Arrays;

public class CheckAnArrayOfIntegersWithoutSpecifiedNumbers {

	public static boolean test(int[] numbers) {
		for (int number : numbers) {
			if (number == 0 || number == -1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arrayNums = { 50, 77, 12, 54, -11, -1, 0};
		System.out.println("The Original Array is: " + Arrays.toString(arrayNums));
		System.out.println("The Result is: " + test(arrayNums));
	}

}
