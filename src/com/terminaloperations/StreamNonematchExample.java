package com.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamNonematchExample {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("john");
		strList.add("tom");
		strList.add("gopinath");
		strList.add("nishanth");
		
		Stream<String> stream = strList.stream();
		
		boolean noneMatch = stream.noneMatch((e) -> {
			return "gopinath".equals(e);
		});
		System.out.println(noneMatch);
		
	}

}
