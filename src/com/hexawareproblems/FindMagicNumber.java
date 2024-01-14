package com.hexawareproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMagicNumber {

	public static void main(String[] args) {
		
		for(int i=1000; i<10000;i++) {
			int num = i;
			int stepCounter = 0;
			System.out.print("Num :" + num);
			while(num !=6174 && num>0) {
				int max = getMax(num);
				int min = getMin(num);
				//System.out.print("   Max:" + max);
				//System.out.print("   Min:" +min);
				num = max - min;
				stepCounter++;
				//System.out.print("   New Num:" + num);
			}
			if(num == 6174)
			  System.out.println(" Total Steps:" + stepCounter);
			else
				System.out.println("  Magic number not found");	
		}
	
	}
	
	private static int getMax(int num) {
		List<Integer> digits = getDigits(num);
		Collections.sort(digits, (i1, i2) -> i2-i1);
		String s="";
		for(int i: digits) {
			s =s+i;
		}
		return Integer.parseInt(s);
	}
	private static int getMin(int num) {
		List<Integer> digits = getDigits(num);
		Collections.sort(digits, (i1, i2) -> i1-i2);
		String s="";
		for(int i: digits) {
			s =s+i;
		}
		return Integer.parseInt(s);
	}
	private static List<Integer> getDigits(int num) {
		List<Integer> digits = new ArrayList<>();
		while(num!=0) {
			int r = num %10;
			num = num/10;
			digits.add(r);
		}
		return digits;
	}
	
}
