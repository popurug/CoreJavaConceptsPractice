package com.arrays;

import java.util.Arrays;

public class InsertElementIntoAnArray {

	public static void main(String[] args) {

		int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		//Insert an element in 3'rd position of the array (index -> 2, value -> 5)
		int indexPosition = 2;
		int newValue = 5;
		System.out.println("The original array is: " + Arrays.toString(array));
		
		for(int i = array.length - 1; i > indexPosition; i--) {
			array[i] = array[i - 1];
		}
		array[indexPosition] = newValue;
		System.out.println("The new array is: " + Arrays.toString(array));
	}

}
