package com.object;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many fibanocci series numbers: ");
		int num = s.nextInt();
		
		//Method call
		displayFibanocciSeries(num);
		s.close();
	}
	
	static void displayFibanocciSeries(int n) {
		int x=1, y=0, z=0, count=1;
		while(count <= n) {
			System.out.println(z+"  ");
			z = x + y;
			x = y;
			y = z;
			count++;
		}
	}
}
