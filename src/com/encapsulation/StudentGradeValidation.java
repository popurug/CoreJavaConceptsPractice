package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class StudentGradeValidation {
	private int studentId;
	private String studentName;
	private List<Double> grades;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Double> getGrades() {
		return grades;
	}

	public void addGrade(double grade) {
		if (grades == null) {
			grades = new ArrayList<>();
		}
		grades.add(grade);
	}

}
