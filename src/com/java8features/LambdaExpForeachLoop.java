package com.java8features;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpForeachLoop {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Gopinath");
		list.add("Nishanth");
		list.add("ManiRam");
		list.add("PurnaChander");
		list.add("Naveen");
		list.add("Ankit");
		
		list.forEach(
				(n) -> System.out.println(n)
			//	System.out.println("The forEach loop results are: ");
          );
	}

}
