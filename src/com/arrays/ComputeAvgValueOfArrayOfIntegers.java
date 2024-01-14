package com.arrays;

import java.util.Arrays;

public class ComputeAvgValueOfArrayOfIntegers {

	public static void main(String[] args) {

		int[] arrayNums = {5, 7, 2, 4, 9};
		System.out.println("Original Array: " + Arrays.toString(arrayNums));
		int maxValue = arrayNums[0];
		int minValue = arrayNums[0];
		float sum = arrayNums[0];
		for(int i = 1; i < arrayNums.length; i++) {
			sum = sum + arrayNums[i];
			if(arrayNums[i] > maxValue)
				maxValue = arrayNums[i];
			else if(arrayNums[i] < minValue)
				minValue = arrayNums[i];
		}
		
		float x = ((sum - maxValue - minValue) / (arrayNums.length - 2));
		System.out.printf("Compute the average value of an array of integers except
				the largest and smallest values: %0.2f", x);"
		System.out.print("\n");
	}

}
