package com.object;

import java.util.Scanner;

public class FinallyInJava {

	public static void main(String[] args) {
		/*
		 * try { int a = 5/1; }catch(Exception e) { System.out.println(e); }finally {
		 * System.out.println("This is in 'finally', it always gets run!!!"); }
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		try {
			System.out.println(s.next());
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			s.close();
		}
	}
}
