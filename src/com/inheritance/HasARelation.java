package com.inheritance;

public class HasARelation {
 
	public static void main(String[] args) {
		Customer cust = new Customer("Tony Marshall", "Mumbai");
		FavoriteFlavors f= new FavoriteFlavors("Strawberry, banana and penutbutter");
		
		System.out.println(cust.Name + " likes " + f.getFlavor());
	}
}
