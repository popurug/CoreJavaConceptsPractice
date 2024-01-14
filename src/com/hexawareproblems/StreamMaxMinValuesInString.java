package com.hexawareproblems;

import java.util.Arrays;
import java.util.List;

public class StreamMaxMinValuesInString {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		System.out.println("Original list of numbers: " + nums);
		
		//Find the maximum value
		Integer max_val = nums.stream()
				.max(Integer::compare)
				.orElse(null);
		
		//Find the minimum value
		Integer min_val = nums.stream()
				.min(Integer::compare)
				.orElse(null);
		
		System.out.println("\n Maximum value in the given list: " + max_val);
		System.out.println("\n Minimum value in the given list: " + min_val);
		
	}

}
