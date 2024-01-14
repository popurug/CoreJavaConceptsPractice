package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		//Creating an instance of ArrayList
		List<Float> list = new ArrayList<Float>();
		
		//Adding elements to arraylist
		list.add(12.4f);
		list.add(34.6f);
		list.add(56.8f);
		list.add(78.9f);
		list.add(88.4f);
		list.add(14.3f);
		
		//Iteration over ArrayList using for each loop
		System.out.println("The list of elements in arraylist are: ");
		for(Float f : list) {
			System.out.println(f);
		}
	}

}
