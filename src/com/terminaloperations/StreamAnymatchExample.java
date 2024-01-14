package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAnymatchExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("Java Guides");
		strList.add("Python Guides");
		strList.add("JavaScript Guides");
		strList.add("Angular Guides");
		
		Stream<String> stream = strList.stream();
		
		boolean anyMatch = stream.anyMatch((value) -> {
			return value.startsWith("Java");
		});
		System.out.println(anyMatch);
	}

}
