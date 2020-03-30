package com.learning.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks = { 98, 99, 92 };
		Student student = new Student("Sagar", marks);

		System.out.println(student.getClass().getSimpleName());
		System.out.println("Student name : " + student.getName());
		System.out.println("getnoOfsubjects :"+ student.getnoOfsubjects());
		System.out.println("getTotalMarksOfAllSubjects :" + student.getTotalMarksOfAllSubjects());
		
		System.out.println("getMaxSubjectMark :" + student.getMaxSubjectMark());
		System.out.println("getMinSubjectMark :" + student.getMinSubjectMark());

		// use BigDecimal for floating point values
		BigDecimal avg = student.avgMarkOfallSubjects();
		System.out.println("avg : " + avg);
	}

}
