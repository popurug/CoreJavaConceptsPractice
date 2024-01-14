package com.banking;

public class EnumJava {
	
	enum Flavor{
		CHOCOLATE, VANILLA, STRAWBERRY;
	}

	public static void main(String[] args) {
		Flavor f = Flavor.STRAWBERRY;
		
		if(f ==f.VANILLA) {
			System.out.println("It's vanilla flavor");
		}else if(f == f.CHOCOLATE) {
			System.out.println("It's chocolate flavor");
		}else if(f == f.STRAWBERRY) {
			System.out.println("It's strawberry flavor");
		}
	}
}
