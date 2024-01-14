package com.object;

import java.util.Scanner;

public class Boiling {

	public static void main(String[] args) {
		System.out.println("Give in the temperature: ");
		Scanner s = new Scanner(System.in);
	    int temp = s.nextInt();
	    if(temp >= 100) {
	    	System.out.println("The water is boiling.");
	    }else {
	    	System.out.println("The water is not boiling. ");
	    }
	    s.close();
	}
}
