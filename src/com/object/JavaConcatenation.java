package com.object;

public class JavaConcatenation {

	public static void main(String[] args) {
		//Custom string 1
		String str1 = "Computer-";
		
		//Custom string 2
		String str2 = "-Science and Information Technology";
		
		//Combining above strings
		String str3 = str1.concat(str2);
		
		//Print and dispaly combined string
		System.out.println(str3);
		
		String str4 = "-Portal";
		String str5 = str3.concat(str4);
		System.out.println(str5);
				
	}
}
