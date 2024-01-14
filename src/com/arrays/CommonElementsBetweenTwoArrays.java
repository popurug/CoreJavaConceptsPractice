package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {

		String[] arr = {"Python", "Java", "PHP", "C#", "C++", "SQL"};
		String[] arr1 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "Java"};
		System.out.println("The first array elements are: " + Arrays.toString(arr));
		System.out.println("The second array elements are: " + Arrays.toString(arr1));
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				if(arr[i] == arr1[j]) {
					set.add(arr[i]);
				}
			}
		}
		System.out.println("The common elements are: " + set);
	}

}
