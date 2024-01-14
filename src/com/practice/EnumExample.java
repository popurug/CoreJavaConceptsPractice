package com.practice;
/* class Mobile{
static final Mobile APPLE = new Mobile();
static final Mobile SAMSUNG = new Mobile();
static final Mobile HTC = new Mobile();
} */

enum Mobile{
	APPLE(100),SAMSUNG,HTC(90),ONE_PLUS;
	int price;
	public int getPrice() {
		return price;
	}
	
	private Mobile(int p) {
		price = p;
	}
	
	Mobile(){
		
	}
} 


public class EnumExample {

	public static void main(String args[]) {
	/*	System.out.println(Mobile.APPLE);
		System.out.println(Mobile.SAMSUNG);
		System.out.println(Mobile.HTC);
		System.out.println(Mobile.ONE_PLUS); */
		
		Mobile m = Mobile.HTC;
		
	/*	switch(m) {
		case APPLE:
			System.out.println("Apple is best");
			break;
		case SAMSUNG:
			System.out.println("First copy of Apple");
			break;
		case HTC:
			System.out.println("Second copy of Apple");
			break;
		} */
		
	//	System.out.println(Mobile.APPLE.getPrice());
		
		Mobile m1[] = Mobile.values();
		
		for(Mobile mobile : m1) {
			System.out.println(mobile);
		}
	}
}
