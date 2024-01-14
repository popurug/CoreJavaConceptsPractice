package com.hexawareproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMagicNumber2 {

	public static void main(String[] args) {
		
		for(int i=1000; i<10000;i++) {
			System.out.println("Num :" + i + "   Total Steps: "+ getMagicNumberSteps(i, 0));
			
		}
	
	}
	
	private static int getMagicNumberSteps(int num, int steps) {
		
		if(num == 6174) {
			  return steps;
		}
		else if(num <= 0)
			return -1;
		int max = getMax(num);
		int min = getMin(num);
		return getMagicNumberSteps(getMax(num) - getMin(num), ++steps);
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
