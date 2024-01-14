package com.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintingNumbers {

	public static void main(String[] args) {

	/*	List<String> list = new ArrayList<String>();
		List<Integer> list1 = new ArrayList<Integer>();
		
		//Adding elements in the list
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		//Iterating the list element using for-each loop
		for(String numbers : list)
			System.out.println(numbers);
		
		for(Integer numeric : list1)
			System.out.println(numeric);
		
		String[] array = {"one", "two", "three", "four"};
		Integer[] array1 = {1, 2, 3, 4};
		
		for(String lang : array)
			list.add(lang);
			System.out.println("Printing list: " + array);
			
		for(Integer nums : array1)
			list1.add(nums);
		   System.out.println("Printing list: " + array1);  */
		
		String[] array = {"one", "two", "three", "four"};
		System.out.println("Printing array: " + Arrays.toString(array));
		//Converting Array to List
		List<String> list = new ArrayList<String>();
		for(String lang:array) {
			list.add(lang);
		}
		System.out.println("Printing list: " + list);
		
		System.out.println("*****************");
		
		Integer[] array1 = {1, 2, 3, 4};
		System.out.println("Printing array: " + Arrays.toString(array1));
		//Converting Array to List
		List<Integer> list1 = new ArrayList<Integer>();
		for(Integer nums : array1) {
			list1.add(nums);
		}
		System.out.println("Printing list: " + list1);
	}
	

}
