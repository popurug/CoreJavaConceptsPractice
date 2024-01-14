package com.functional.inteface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		/*Bird parrot = new Parrot();
		parrot.fly();*/
		/*Bird sparrow = new Bird() {			
			@Override
			public void fly(int height) {
				System.out.println("Sparrow can fly "+ height +" meters..");
				
			}
		};
		sparrow.fly(150);
		Bird sparrow2 =  height->System.out.println("Sparrow can fly "+ height + "+ meters..");		
						
		sparrow2.fly(150);
		*/
		//public abstract boolean test(java.lang.Object arg0);
		Employee emp1 = new Employee("E1", 25, 1000);
		Employee emp2 = new Employee("E2", 35, 2000);
		Employee emp3 = new Employee("E3", 45, 1000);
		Employee emp4 = new Employee("E4", 55, 1500);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		Predicate p;
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		for(Employee emp: employees) {
			if(emp.getSalary() >= 1500)
				System.out.println(emp);
		}
		
		System.out.println("Employees getting salary >= 1500");
		
		List<Employee> filterEmployees = employees.stream().filter( new Predicate<Employee>() {
								public boolean test(Employee arg0) { return arg0.getSalary() >= 1500; }
								}).collect(Collectors.toList());
		
		//List<Employee> filterEmployees1 = employees.stream().filter(arg0-> arg0.getSalary() >= 1500).collect(Collectors.toList());
		//employees.forEach(emp->{ if(emp.getSalary()>=1500) System.out.println(emp);});
		// public abstract void accept(java.lang.Object arg0);
		employees.forEach(new Consumer<Employee>() {
			public void accept(Employee emp) {
				if(emp.getSalary()>=1500) 
					System.out.println(emp);
			}
		});
		
		employees.forEach(emp->	{if(emp.getSalary()>=1500) System.out.println(emp);});
			
		
		Consumer c;
	}
	
	public void fly(int height) {
		System.out.println("Sparrow can fly \"+ height + \"+ meters..");
	}
	
}
