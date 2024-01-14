package com.javarecursivemethods;

import java.util.Arrays;

public class FindMaximumElementInArray {

	public static int findMaxElement(int[] arr) {
		return findMaxElement(arr, 0, arr.length - 1);
	}

	public static int findMaxElement(int[] arr, int left, int right) {
		// Base case: If the left and right indices are equal, we have a
		// single element and return it as the maximum
		if (left == right) {
			return arr[left];
		}

		// Recursive case: Divide the array into two halves, recursively find the
		// maximum in
		// each half, and return the greater of two maximums
		int mid = (left + right) / 2;
		int maxLeft = findMaxElement(arr, left, mid);
		int maxRight = findMaxElement(arr, mid + 1, right);
		return Math.max(maxLeft, maxRight);
	}

	public static void main(String[] args) {

		int[] arr = { 34, 45, 34, 23, 56, 62, 27, 55 };
		System.out.println("Original array is: " + Arrays.toString(arr));
		int maxElement = findMaxElement(arr);
		System.out.println("The maximum element in the array is: " + maxElement);
	}

}
