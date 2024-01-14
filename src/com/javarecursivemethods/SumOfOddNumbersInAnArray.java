package com.javarecursivemethods;

public class SumOfOddNumbersInAnArray {

	public static int calculateOddNumberSum(int[] arr, int index) {
		// Base case: If the index reaches end of the array, return 0
		if (index == arr.length) {
			return 0;
		}

		// Recursive case: Check if the element at the current index odd,
		// and recursively call the method with the next index and add the current
		// element if it is odd
		int sum = calculateOddNumberSum(arr, index + 1);
		if (arr[index] % 2 != 0) {
			sum += arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int index = 0;
		int sum = calculateOddNumberSum(nums, index);
		System.out.println("The sum of all odd numbers in the array is: " + sum);
	}

}
