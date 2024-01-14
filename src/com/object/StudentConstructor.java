package com.object;

public class StudentConstructor {

	String name;
	int rno;
	
	public StudentConstructor() {
		name = "Gopinath Popuru";
		rno = 884;
	}
	
	public StudentConstructor(String str, int n) {
		name = str;
		rno = n;
		
	}
	public static void main(String[] args) {
		StudentConstructor s1 = new StudentConstructor();
		StudentConstructor s2 = new StudentConstructor("Nishanth Bandala", 143);
		System.out.println(s1.name);
		System.out.println(s1.rno);
		System.out.println(s2.name);
		System.out.println(s2.rno);
	}
}
