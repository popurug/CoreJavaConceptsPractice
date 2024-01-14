package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {

		String[] arr = new String[] {"Python", "Java", "PHP", "Perl", "c++", "Kotlin"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		
		System.out.println(list);
	}

}
