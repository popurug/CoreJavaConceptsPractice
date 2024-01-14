package com.practice;
import java.util.*;
import java.util.stream.Collectors;
class Product4{
	int id;
	String name;
	float price;
	
	public Product4(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public float getPrice() {
		return price;
	}
}
public class MethodReferenceInStream {
 
	public static void main(String args[]) {
		List<Product4> productsList = new ArrayList<Product4>();
		
		//Adding Products
		productsList.add(new Product4(1, "HP Laptop", 25000f));
		productsList.add(new Product4(2, "Dell Laptop", 30000f));
		productsList.add(new Product4(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product4(4, "Sony Laptop", 28000f));
		productsList.add(new Product4(5, "Apple Laptop", 90000f));
		
		List<Float> productPriceList = 
				productsList.stream()
				      .filter(p -> p.price < 90000)  //filtering data
				      .map(Product4::getPrice)  //fetching price by referring getPrice method
				      .collect(Collectors.toList());  //collecting as list
		
		System.out.println(productPriceList);
	}
}
