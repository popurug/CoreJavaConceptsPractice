package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEachLoop {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Grapes");
		list.add("Kiwi");
		list.add("Guawa");
		
		list.forEach(
				(n)->System.out.println(n)
				);
	}
}
