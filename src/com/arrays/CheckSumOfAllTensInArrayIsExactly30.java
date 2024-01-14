package com.arrays;

import java.util.Arrays;

public class CheckSumOfAllTensInArrayIsExactly30 {

	public static boolean result(int[] numbers, int searchNum, int fixedSum) {
		int tempSum = 0;
		for (int number : numbers) {
			if (number == searchNum) {
				tempSum = tempSum + searchNum;
			}

			if (tempSum > fixedSum) {
				break;
			}
		}
		return tempSum == fixedSum;
	}

	public static void main(String[] args) {

		int[] arrayNums = { 10, 77, 10, 54, -11, 10 };
		System.out.println("The Original Array is: " + Arrays.toString(arrayNums));
		int searchNum = 10;
		int fixedSum = 30;

		System.out.println("The Result is: " + result(arrayNums, searchNum, fixedSum));
	}

}
