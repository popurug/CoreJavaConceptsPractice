package com.arrays;

public class ArrayContainsSpecificValue {
	
	public static boolean contains(int[] arr, int item) {
		for(int n : arr) {
			System.out.println("The numbers in the list are: " + n);
			if(item == n) {
				System.out.println("The item value is: " + item);
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {

		int[] numsArray = {1789, 2035, 1899, 1456, 2013, 1458, 1567, 2458, 1254, 1472, 2365,
				1456, 2265, 1457, 2456};
		System.out.println(contains(numsArray, 1567));
		System.out.println(contains(numsArray, 2023));
	}

}
