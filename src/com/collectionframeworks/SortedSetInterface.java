package com.collectionframeworks;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
	
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("Gopinath");
		set.add("Nishanth");
		set.add("ManiRam");
		set.add("Naveen");
		set.add("Purnachandar");
		set.add("Badri");
		
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Object element = i.next();
			System.out.println(element.toString());
		}
	}
}
