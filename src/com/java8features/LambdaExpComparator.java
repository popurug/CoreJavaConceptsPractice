package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpComparator {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		//Adding products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));
		list.add(new Product(4, "Apple Laptop", 90000f));
		
		System.out.println("Sorting on the basis of name....");
		
		//Implementing Lambda Expression
		Collections.sort(list,(p2,p1) -> {
			return p1.name.compareTo(p2.name);
		});
		
		for(Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}

}
