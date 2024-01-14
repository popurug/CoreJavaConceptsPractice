package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamForeachExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("one");
		
		Stream<String> stream = strList.stream();
		
		System.out.println("The elements in the given list are: ");
		stream.forEach(e -> {
			System.out.println(e);
		});
	}

}
