package com.object;

public class JavaSBuffer {

	public static void main(String[] args) {
	//	StringBuffer sb = new StringBuffer("My name is Gopinath Popuru " + "AND");
		
		StringBuffer s = new StringBuffer("GeeksGeeks");
		
		/*
		 * //Getting the length of the string: int x = sb.length();
		 * System.out.println("The length of the given string is: " + x);
		 * 
		 * //Getting the capacity of the string: int y = sb.capacity();
		 * System.out.println("The capacity of the given string is: " + y);
		 */
		
		//Usage of the append() method:
		/*
		 * sb.
		 * append(" I am pursing master's in computer science and information technology "
		 * + "&"); System.out.println(sb);
		 * 
		 * sb.append(" My GPA is 8.0"); System.out.println(sb);
		 */
		
		//Inserting element and position as an arguments
		s.insert(5, "for");
		//Retruns GeeksforGeeks
		System.out.println(s);
		
		s.insert(0, 5);
		//Returns 5GeeksforGeeks
		System.out.println(s);
		
		s.insert(3, true);
		//Retruns 5GetrueeksforGeeks
		System.out.println(s);
		
		s.insert(5, 41.35d);
		//Returns 5Getr41.35ueeksforGeeks
		System.out.println(s);
		
		s.insert(8, 41.35f);
		//Returns 5Getr41.41.3535ueeksforGeeks
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
	}
}
