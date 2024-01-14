package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindfirstExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("nine");
		strList.add("two");
		strList.add("three");
		strList.add("one");
		
		Stream<String> stream = strList.stream();
		
		Optional<String> findFirst = stream.findFirst();
		
		System.out.println(findFirst.get());
	}

}
