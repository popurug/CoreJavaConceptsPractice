package com.encapsulation;

import java.util.List;

public class StudentEncapsulation {

	public static void main(String[] args) {

		StudentGradeValidation sgv = new StudentGradeValidation();

		// Set the values using the setter methods
		sgv.setStudentId(884);
		sgv.setStudentName("Gopinath Popuru");

		// Add grades using the addGrade() method
		sgv.addGrade(92.5);
		sgv.addGrade(89.6);
		sgv.addGrade(90.4);
		sgv.addGrade(60.5);

		// Get the values using the getter methods
		int studentId = sgv.getStudentId();
		String studentName = sgv.getStudentName();
		List<Double> grades = sgv.getGrades();

		// Print the values
		System.out.println("The student id is: " + studentId);
		System.out.println("The student name is: " + studentName);
		System.out.println("The student grade is: " + grades);
	}

}
