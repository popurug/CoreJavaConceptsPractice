package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListInAscendingOrder {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(10, "Gopinath Popuru", 30, 400000));
		emps.add(new Employee(20, "Nishanth Bandala", 29, 350000));
		emps.add(new Employee(30, "ManiRam Pulipati", 25, 450000));
		emps.add(new Employee(40, "Naveen Pathuri", 32, 500000));

		// Sort list in ascending order
		Collections.sort(emps, new MySort());
		System.out.println(emps);
	}

}
