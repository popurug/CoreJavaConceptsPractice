package com.functionallambdaexpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListOfObjectsBasedOnSpecificAttribute {

	public static void main(String[] args) {

		//Create a list of objects
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Gopinath Popuru", 884, "X"));
		studentList.add(new Student("Nishanth Bandala", 143, "X"));
		studentList.add(new Student("ManiRam Pulipati", 123, "X"));
		studentList.add(new Student("Naveen Pathuri", 156, "X"));
		
		//Student details
		System.out.println("Student details: ");
		for(Student Student : studentList) {
			System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getClass());
		}
		
		//Sort the list based on age using lambda expression
		studentList.sort(Comparator.comparing(Student::getName));
		
		//Print the sorted list
		System.out.println("\n Sorted list based on Student Name:");
		for(Student Student : studentList) {
			System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getClass());
		}
	}

}
