package com.javarecursivemethods;

import java.util.Arrays;

public class RecursiveArraySorting {

	public static boolean isSorted(int[] arr) {
		return isSorted(arr, 0);
	}

	private static boolean isSorted(int[] arr, int index) {
		// Base case: If the index reaches the end of the array,
		// the array is sorted
		if (index == arr.length-1) {
			return true;
		}

		// Recursive case: Check if the element at the current index is greater than the
		// next element, and recursively call the method with the next index
		if (arr[index] > arr[index + 1]) {
			return false;
		}

		return isSorted(arr, index + 1);
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Original array is: " + Arrays.toString(arr1));
		boolean sorted1 = isSorted(arr1);
		System.out.println("Is arr1 sorted in ascending order? " + sorted1);
		System.out.println("*********************");
		int[] arr2 = { 6, 5, 4, 3, 2, 1 };
		System.out.println("Original array is: " + Arrays.toString(arr2));
		boolean sorted2 = isSorted(arr2);
		System.out.println("Is arr2 sorted in ascending order? " + sorted2);

	}

}
