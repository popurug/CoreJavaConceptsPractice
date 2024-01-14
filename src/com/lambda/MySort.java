package com.lambda;

import java.util.Comparator;

public class MySort implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		return (int) (obj1.getSalary() - obj2.getSalary());

	}

}
