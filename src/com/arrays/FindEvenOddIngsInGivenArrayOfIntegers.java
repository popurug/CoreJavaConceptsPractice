package com.arrays;

import java.util.Arrays;

public class FindEvenOddIngsInGivenArrayOfIntegers {

	public static void main(String[] args) {

	//	int[] arrayNums = {5, 7, 2, 4, 9};
		int[] arrayNums = {5, 7, 11, 17, 18, 2, 4, 9, 14};
		System.out.println("The Original Array is: " + Arrays.toString(arrayNums));
		int counter = 0;
		for(int i = 0; i < arrayNums.length; i++) {
			if(arrayNums[i] % 2 == 0)
				counter++;
		}
		
		System.out.println("Number of even numbers: " + counter);
		System.out.println("Number of odd numbers: " + (arrayNums.length - counter));
	}

}
