package com.arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int totalNum;
		int[] nums = new int[] {1, 2, 3, 4, 6, 7};
		totalNum = 7;
		int expectedNumSum = totalNum * ((totalNum + 1) / 2);
		int numSum = 0;
		
		for(int i : nums) {
			System.out.println(i);
			System.out.println("*******");
			System.out.println("The numSum value is: " + numSum);
			numSum = numSum + i;
		}
		System.out.print("The missing element in array is: " + (expectedNumSum - numSum));
		System.out.print("\n");
	}

}
