package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamToarrayExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		
		Stream<String> stream = strList.stream();
		
		Object[] obj = stream.toArray();
		
		System.out.println("The values in the given list are: ");
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
	}

}
