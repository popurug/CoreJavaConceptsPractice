package com.hexawareproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateIntegersUsingList {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 45, 55, 3, 32, 22, 22, 55, 1));
		HashSet<Integer> hCheckSet = new HashSet<>();
		HashSet<Integer> hTargerSet = new HashSet<>();
		for (Integer integer : arr) {
			if (!hCheckSet.add(integer)) {
				hTargerSet.add(integer);
			}
		}
		System.out.println("Duplicate integers in given list is/are " + hTargerSet);
	}

}
