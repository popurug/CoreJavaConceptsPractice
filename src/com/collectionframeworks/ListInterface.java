package com.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("David");
		list.add("Jhon");
		list.add("Stacy");
		list.add("Jhon");
		for(String Students : list)
           System.out.println(Students);		
	}
}
