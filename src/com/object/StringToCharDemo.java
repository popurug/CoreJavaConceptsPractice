package com.object;

public class StringToCharDemo {

	public static void main(String[] args) {
		//Using charAt() method
	//	String str = "Hello";
		String str = "Gopinath Popuru";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("Character at "+i+" Position: "+ch);
		}
	}
}
