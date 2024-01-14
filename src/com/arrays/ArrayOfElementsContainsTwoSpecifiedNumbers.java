package com.arrays;

import java.util.Arrays;

public class ArrayOfElementsContainsTwoSpecifiedNumbers {

	public static boolean result(int[] arrayNums, int num1, int num2) {
		for (int number : arrayNums) {
			boolean r = number != num1 && number != num2;

			if (r) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] arrayNums = { 77, 77, 65, 65, 65, 77 };
		System.out.println("Original Array is: " + Arrays.toString(arrayNums));
		int num1 = 45;
		int num2 = 95;

		System.out.println("The Result is: " + result(arrayNums, num1, num2));
	}

}
