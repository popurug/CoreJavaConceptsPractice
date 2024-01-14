package com.collectionframeworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleAlgorithm {

	public static void main(String[] args) {
		Integer[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		List<Integer> intList = Arrays.asList(intArray);
		
		Collections.shuffle(intList);
		intList.toArray(intArray);
		System.out.println(Arrays.toString(intArray));
	}
}
