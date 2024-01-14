package com.hexawareproblems;

import java.util.ArrayList;
import java.util.List;

public class Java8IntermediateTerminalOprations {

	public static void main(String[] args) {

		List<String> laptopList = new ArrayList();
		laptopList.add("DELL");
		laptopList.add("ACER");
		laptopList.add("HP");
		laptopList.add("Lenovo");
		laptopList.add("MacBook");
		laptopList.add("ChromeBook");
		
		//Intermediate operation
		laptopList.sort((p1, p2) -> p1.compareTo(p2));
		
		//Terminal operation
		laptopList.forEach(a -> {
			System.out.println(a);
		});
	}

}
