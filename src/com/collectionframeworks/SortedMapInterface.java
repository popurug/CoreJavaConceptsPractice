package com.collectionframeworks;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapInterface {

	public static void main(String[] args) {
		TreeMap<String, Double> t = new TreeMap<String, Double>();
		t.put("Jhon",  Double(76.5));
		t.put("Molley", Double(87.3));
		t.put("Aron", Double(78.2));
		t.put("Daisy", Double(73.4));
		
		Set<?> set = t.entrySet();
		
		Iterator<?> i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
	//		System.out.println(me.getValue());
		}
		System.out.println();
		
		double percentage = ((Double)t.get("Molley")).doubleValue();
		t.put("Molley",  Double(percentage));
		System.out.println("Molley's aggregate: " + t.get("Molley"));
	}

	private static Double Double(double d) {
		// TODO Auto-generated method stub
		return d;
	}
}
