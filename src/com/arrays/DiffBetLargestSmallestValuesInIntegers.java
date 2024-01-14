package com.arrays;

import java.util.Arrays;

public class DiffBetLargestSmallestValuesInIntegers {

	public static void main(String[] args) {

	//	int[] arrayNums = { 5, 7, 2, 4, 9 };
		int[] arrayNums = {2, 4, 6, 8, 10, 12};
		System.out.println("The Original Array is: " + Arrays.toString(arrayNums));
		int maxVal = arrayNums[0];
		int minVal = arrayNums[0];

		for (int i = 1; i < arrayNums.length; i++) {
			if (arrayNums[i] > maxVal)
				maxVal = arrayNums[i];
			else if (arrayNums[i] < minVal)
				minVal = arrayNums[i];
		}
		System.out.println(
				"Difference between the largest and smallest values of the given array is: " + (maxVal - minVal));
	}

}
