package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Bike{
	int Id;
	String Manufacturer;
	float onRoadPrice;
	
	public Bike(int Id, String Manufacturer, float onRoadPrice) {
		super();
		this.Id = Id;
		this.Manufacturer = Manufacturer;
		this.onRoadPrice = onRoadPrice;
	}
}

public class LambdaFilterOperation {

	public static void main(String[] args) {
		List<Bike> list = new ArrayList<Bike>();
		list.add(new Bike(1, "Yamaha", 150000));
		list.add(new Bike(3, "Bajaj", 125000));
		list.add(new Bike(6, "Hero", 80000));
		list.add(new Bike(8, "TataMotors", 175000));
		list.add(new Bike(10, "Swaraj Motors", 190000));
		
		Stream<Bike> filtered_data = list.stream().filter(b -> b.onRoadPrice > 80000);
		
		filtered_data.forEach(Bike -> System.out.println(Bike.Manufacturer + " : " + Bike.onRoadPrice ));
	}
}
