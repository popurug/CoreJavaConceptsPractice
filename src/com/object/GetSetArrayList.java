package com.object;

import java.util.ArrayList;
import java.util.Iterator;

public class GetSetArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("StrawBerry");
		list1.add("Kiwi");
		list1.add("Guava");
		list1.add("WaterMelon");
		list1.add("Pineapple");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Cricket");
		list2.add("Hockey");
		list2.add("FootBall");
		list2.add("ValleyBall");
		list2.add("Chess");
		
		//Accessing the element
		System.out.println("Returning element: " + list.get(2));
		//changing the element
		list.set(3, "Dates");
		
		//Traversing list
		for(String fruit : list) {
			System.out.println(fruit);
		}
		
		//Iterating the list through iterator.
		Iterator<String> itr = list1.iterator();
		System.out.println("************************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("***********************");
		for(String sports : list2) {
			System.out.println(sports);
		}
	}

}
