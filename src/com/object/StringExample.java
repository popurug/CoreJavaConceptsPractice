package com.object;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "Gopinath Popuru"; //creating string by Java string literal
		char ch[] = {'s','t','r','i','n','g','s'}; 
		String s2 = new String(ch); //converting char array to string
		String s3 = new String("example"); //creating java string by new keyword
		String s4 = new String("Nishanth Bandala");
		String s5 = new String("Maniram Pulipati");
		String s6 = new String("NaveenKumar Pathuri");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}
