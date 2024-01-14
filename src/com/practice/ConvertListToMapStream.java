package com.practice;

import java.util.*;
import java.util.stream.Collectors;

class Product3 {
	int id;
	String name;
	float price;

	public Product3(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}
}

public class ConvertListToMapStream {

	public static void main(String args[]) {
		List<Product3> productsList = new ArrayList<Product3>();

		// Adding Products
		productsList.add(new Product3(1, "HP Laptop", 25000f));
		productsList.add(new Product3(2, "Dell Laptop", 30000f));
		productsList.add(new Product3(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product3(4, "Sony Laptop", 28000f));
		productsList.add(new Product3(5, "Apple Laptop", 90000f));

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));

		System.out.println(productPriceMap);
	}

}
