package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAllmatchExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("Java Guides");
		strList.add("Python Guides");
		strList.add("JavaScript Guides");
		strList.add("Angular Guides");
		
		Stream<String> stream = strList.stream();
		
		boolean allMatch = stream.allMatch((v) -> {
			return v.contains("Guides");
		});
		System.out.println(allMatch);
	}

}
