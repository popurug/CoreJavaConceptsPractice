package com.abstraction;

public class Employee extends Person {

	private int EmpId;
	
	public Employee(String EmployeeName, String Gen, int EmployeeID) {
		super(EmployeeName, Gen);
		this.EmpId = EmployeeID;
	}
	
	@Override
	public void Office() {
		if (EmpId == 0) {
			System.out.println("Employee Logged Out");
		} else {
			System.out.println("Employee Logged In");
		}
	}
	
	public static void main(String[] args) {
		Person employee = new Employee("Nishanth", "Male", 884);
		
		employee.Office();
		employee.changeName("NishanthReddy Bandala");
		System.out.println(employee.toString());
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
}
