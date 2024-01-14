package com.arrays;

public class IndexOfAnArrayElement {
	
	public static int findIndex(int[] arr, int t) {
		if(arr == null)
			return -1;
		int len = arr.length;
		int i = 0;
		while(i < len) {
			if(arr[i] == t)
				return i;
			else
				i = i + 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] numsArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Index position of 25 is: " + findIndex(numsArray, 25));
		System.out.println("Index position of 77 is: " + findIndex(numsArray, 77));
		System.out.println("Index position of 14 is: " + findIndex(numsArray, 14));
		System.out.println("Index position of 49 is: " + findIndex(numsArray, 49));
		System.out.println("Index position of 29 is: " + findIndex(numsArray, 29));
		System.out.println("Index position of 18 is: " + findIndex(numsArray, 18));
		System.out.println("Index position of 56 is: " + findIndex(numsArray, 56));
		System.out.println("Index position of 36 is: " + findIndex(numsArray, 36));
		System.out.println("Index position of 15 is: " + findIndex(numsArray, 15));
		System.out.println("Index position of 56 is: " + findIndex(numsArray, 56));
	}

}
