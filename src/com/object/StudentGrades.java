package com.object;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		int marks[] = new int[6];
		int i;
		float total=0, avg;
		Scanner s = new Scanner(System.in);
		
		for(i=0; i<6; i++) {
			System.out.println("Enter marks of subject"+(i+1)+":");
			marks[i] = s.nextInt();
			total = total + marks[i];
		}
		s.close();
		//Calculating average here
		avg = total/6;
		System.out.println("The average value is: "+avg);
		System.out.println("The student Grade is: ");
		if(avg >= 80) {
			System.out.print("A");
		}else if(avg >= 60 && avg <80) {
			System.out.print("B");
		}else if(avg >= 40 && avg < 60) {
			System.out.print("C");
		}else {
			System.out.print("D");
		}
	}
}
