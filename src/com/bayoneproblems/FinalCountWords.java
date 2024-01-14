package com.bayoneproblems;

import java.util.HashMap;
import java.util.Scanner;

public class FinalCountWords {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str;

		System.out.println("Enter the string: ");
		str = s.nextLine();

		String[] splitFn = str.split(" ");
		HashMap<String, Integer> Hmap = new HashMap<String, Integer>();

		for (int i = 0; i < splitFn.length - 1; i++) {
			if (Hmap.containsKey(splitFn[i])) {
				int count = Hmap.get(splitFn[i]);
				Hmap.put(splitFn[i], count + 1);
			} else {
				Hmap.put(splitFn[i], 1);
			}
		}
		System.out.println(Hmap);
	}

}
