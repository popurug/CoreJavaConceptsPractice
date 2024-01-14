package com.object;

import java.util.HashMap;

public class HashMapInJava {

	public static void main(String[] args) {
		int a = 10;
		int b = 23;
		int c = 34;
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 10);
		hm.put("b", 23);
		hm.put("c", 34);
		
		System.out.println(hm.get("c"));
		System.out.println(hm.get("b"));
		System.out.println(hm.get("a"));
		
		HashMap<String, String> funny = new HashMap<String, String>();
		funny.put("nishanth1993", "root143");
		funny.put("gopi123", "pass@884");
		funny.put("maniram167", "password");
		
		funny.remove("maniram167");
		System.out.println(funny);
		
		System.out.println(funny.containsValue("pass@883"));
		
		System.out.println(funny.containsKey("nishanth1993"));
		
		System.out.println(funny.size());
		
		System.out.println(funny.replace("nishanth1993", "153root"));
		System.out.println(funny);
		
		System.out.println(funny.values());
		
		System.out.println(funny.keySet());
	}
}
