package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindanyExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("two");
		strList.add("one");
		strList.add("three");
		strList.add("four");
		strList.add("five");
		
		Stream<String> stream = strList.stream();
		
		Optional<String> anyElement = stream.findAny();
		
		System.out.println(anyElement.get());
	}

}
