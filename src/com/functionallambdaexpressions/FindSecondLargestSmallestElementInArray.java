package com.functionallambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestSmallestElementInArray {

	public static void main(String[] args) {

		Integer[] nums = { 1, 7, 18, 25, 77, 300, 101 };
		System.out.println("Array elements are: " + Arrays.toString(nums));

		// Find the second largest element using lambda expression
		Integer secondLargest = Arrays.stream(nums).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElse(null);

		// Find the second smallest element using lambda expression
		Integer secondSmallest = Arrays.stream(nums).distinct().sorted().skip(1).findFirst().orElse(null);

		// Print the result
		System.out.println("Second largest element is: " + secondLargest);
		System.out.println("Second smallest element is: " + secondSmallest);
	}

}
