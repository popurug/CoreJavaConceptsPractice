package com.object;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {

		//Creating a list of fruits
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		//Sorting the list
		Collections.sort(list);
		
		//Traversing list through for-each loop
		for(String fruit : list) {
			System.out.println(fruit);
		}
		
		System.out.println("Sorting numbers....");
		
		//Creating a list of numbers
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(25);
		list1.add(11);
		list1.add(53);
		list1.add(6);
		
		//Sorting the list
		Collections.sort(list1);
		
		for(Integer numbers : list1) {
			System.out.println(numbers);
		}
	}

}
