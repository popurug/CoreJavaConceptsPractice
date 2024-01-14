package com.object;

public class LargestOfThreeNums {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 100, num4 = 40;
		
		if(num1 >= num2 && num1 >= num3 && num1 >= num4) {
			System.out.println(num1+" is the largest Number");
		}else if(num2 >= num1 && num2 >= num3 && num2 >= num4) {
			System.out.println(num2+" is the largest Number");
		}else if(num3 >= num1 && num3 >= num2 && num3 >= num4 ) {
			System.out.println(num3+" is the largest Number");
		}else {
			System.out.println(num4+" is the largest Number");
		}
	}
}
