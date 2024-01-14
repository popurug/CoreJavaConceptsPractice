package com.arrays;

public class SumEqualToSpecifiedNumber {
	
	public static void pairValue(int inputArr[], int inputNum) {
		System.out.println("Pairs of elements and their sum is: ");
		
		for(int i = 0; i < inputArr.length; i++) {
			for(int j = i+1; j < inputArr.length; j++) {
				if(inputArr[i] + inputArr[j] == inputNum) {
					System.out.println(inputArr[i] + " + " + inputArr[j] + " = " + inputNum);
				}
			}
		}
	}

	public static void main(String[] args) {

		pairValue(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
		pairValue(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
		pairValue(new int[] {2, 4, 6, 8, 10, 12}, 10);
	}

}
