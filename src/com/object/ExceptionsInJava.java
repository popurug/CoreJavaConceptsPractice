package com.object;

import java.util.ArrayList;

public class ExceptionsInJava {

	public static void main(String[] args) {
		String[] pets = {"dog", "cat", "monkey"};
		System.out.println(pets[1]);
		
	//	ArrayList<String> list = null;
	//	list.get(2);
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("book");
		l.add("Gopinath Popuru");
		l.add("Nishanth Bandala");
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
	}
}
