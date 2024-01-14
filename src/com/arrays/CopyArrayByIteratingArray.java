package com.arrays;

import java.util.Arrays;

public class CopyArrayByIteratingArray {

	public static void main(String[] args) {

		int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] newArray = new int[20];
		int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] newArr = new int[10];
		System.out.println("The source array is: " + Arrays.toString(myArray));
		
		for(int i = 0; i <myArray.length; i++) {
			newArray[i] = myArray[i];
		}
		System.out.println("The new array is: " + Arrays.toString(newArray));
		
		System.out.println("*********************");
		System.out.println("The another source array is: " + Arrays.toString(array));
		
		for(int i = 0; i < array.length; i++) {
			newArr[i] = array[i];
		}
		System.out.println("The new array is: " + Arrays.toString(newArr));
	}

}
