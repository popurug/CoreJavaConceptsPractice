package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCountExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		strList.add("five");
		
		Stream<String> stream = strList.stream();
		
		long countElements = stream
				.map(v -> v.toUpperCase())
				.count();
		
		System.out.println(countElements);
	}

}
