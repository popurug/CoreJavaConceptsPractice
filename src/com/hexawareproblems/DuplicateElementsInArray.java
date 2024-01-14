package com.hexawareproblems;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 5, 6, 6, 7, 2 };
	//	int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && (i != j)) {
					System.out.println("Duplicate elements are: " + array[j]);
				}
			}
	//		System.out.println("There are no duplicate elements in the array!!");
		}
	}

}
