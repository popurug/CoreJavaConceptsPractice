package com.functionallambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromListOfIntegers {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);

		// Print the list
		System.out.println("List elements are: " + nums);

		// Remove duplicates using lambda expression
		List<Integer> uniqueNums = new ArrayList<Integer>();
		nums.stream().distinct().forEach(uniqueNums::add);

		// Print the list without duplicates
		System.out.println("\n List of elements without duplicates: " + uniqueNums);
	}

}
