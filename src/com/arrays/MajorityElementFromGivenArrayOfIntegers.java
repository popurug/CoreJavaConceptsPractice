package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElementFromGivenArrayOfIntegers {

	public static int majorityElement(int arr[]) {
		int n = arr.length;

		// HashMap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Element's frequency in a map
		for (int i = 0; i < n; i++) {
			if (map.get(arr[i]) == null)
				map.put(arr[i], 0);

			map.put(arr[i], map.get(arr[i]) + 1);
		}

		// Return the element if its count is more than n/2
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			if ((int) pair.getValue() > n / 2)
				return (int) pair.getKey();

			itr.remove();
		}

		// No majority element
		return -1;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 6, 6, 5, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		System.out.println("The Orirginal Array is: " + Arrays.toString(nums));
		int result = majorityElement(nums);
		if (result != -1)
			System.out.println("Majority element is: " + result);
		else
			System.out.println("Majority element does not exist");
	}

}
