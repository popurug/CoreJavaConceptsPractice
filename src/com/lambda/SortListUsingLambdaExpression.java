package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListUsingLambdaExpression {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(10, "Gopinath Popuru", 30, 400000));
		emps.add(new Employee(20, "Nishanth Bandala", 29, 350000));
		emps.add(new Employee(30, "ManiRam Pulipati", 25, 450000));
		emps.add(new Employee(40, "Naveen Pathuri", 32, 500000));
		
		Collections.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee obj1, Employee obj2) {
				return (int)(obj1.getName().compareTo(obj2.getName()));
			}
		});
		
		//Using lambda expression ascending order
		Collections.sort(emps, (obj1, obj2) -> (obj1.getName().compareTo(obj2.getName())));
		System.out.println("Ascending order => " + emps);
		
		//Using lambda expression descending order
		Collections.sort(emps, (obj1, obj2) -> (obj2.getName().compareTo(obj1.getName())));
		System.out.println("Descending order => " + emps);
	}

}
