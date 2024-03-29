package com.arrays;

import java.util.Arrays;

public class RemoveSpecificElementFromArray {

	public static void main(String[] args) {

		int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("The original array is: " + Arrays.toString(myArray));
		
		//Remove the second element (index -> 1, value -> 14) of the array
		int removeIndex = 9;
		
		for(int i = removeIndex; i < myArray.length - 1; i++) {
			myArray[i] = myArray[i + 1];
		}
		
		//We cannot alter the size of an array, after removal, the last and second last element
		//in the array will exist twice.
		System.out.println("After removing the second element: " + Arrays.toString(myArray));
	}

}
