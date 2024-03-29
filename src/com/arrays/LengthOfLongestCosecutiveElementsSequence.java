package com.arrays;

import java.util.HashSet;

public class LengthOfLongestCosecutiveElementsSequence {

	public static int longestSequence(int[] nums) {
		final HashSet<Integer> hSet = new HashSet<Integer>();
		for (int i : nums)
			hSet.add(i);

		int longestSequenceLen = 0;
		for (int i : nums) {
			int length = 1;
			for (int j = i - 1; hSet.contains(j); j--) {
				hSet.remove(j);
				length++;
			}
			for (int j = i + 1; hSet.contains(j); j++) {
				hSet.remove(j);
				length++;
			}
			longestSequenceLen = Math.max(longestSequenceLen, length);
		}
		return longestSequenceLen;
	}

	public static void main(String[] args) {

		int nums[] = { 49, 1, 3, 200, 2, 4, 70, 5 };
		System.out.println("The Original Array Length: " + nums.length);
		System.out.print("Array elements are: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n The new length of the array is: " + longestSequence(nums));
	}

}
