package com.object;
enum Level {
	LOW, MEDIUM, HIGH;
}
public class EnumsInJava {

	static String[] levels = {"Low", "Medium", "High"};
	
	public static void main(String[] args) {
		System.out.println(levels[0]);
		System.out.println(levels[1]);
		System.out.println(levels[2]);
		System.out.println("======================");
		Level l = Level.MEDIUM;
		System.out.println(l);
		Level l1 = Level.HIGH;
		System.out.println(l1);
		Level l2 = Level.LOW;
		System.out.println(l2);
		
		switch(l) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}
}
