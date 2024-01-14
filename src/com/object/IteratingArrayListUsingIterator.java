package com.object;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayListUsingIterator {

	public static void main(String[] args) {

	/*	//Creating arraylist
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Grapes");
		list.add("Banana");
		list.add("StrawBerry");
		
		//Traversing list through iterator.
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}  */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		//Traversing list through for-each loop
		for(String nums : list) {
			System.out.println(nums);
		}
		
		
		
	}

}
