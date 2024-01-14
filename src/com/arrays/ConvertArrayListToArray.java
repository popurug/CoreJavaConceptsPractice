package com.arrays;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {

	   ArrayList<String> list = new ArrayList<String>();
	   list.add("Python");
	   list.add("Java");
	   list.add("PHP");
	   list.add("Perl");
	   list.add("C++");
	   list.add("Kotlin");
	   
	   String[] arr = new String[list.size()];
	   list.toArray(arr);
	   
	   System.out.println("The converted elements in the array are: ");
	   for(String s : arr) {
		   System.out.println(s);
	   }
	}

}
