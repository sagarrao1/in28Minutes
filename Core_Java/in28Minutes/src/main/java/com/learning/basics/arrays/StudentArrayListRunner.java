package com.learning.basics.arrays;

import java.math.BigDecimal;

public class StudentArrayListRunner {

	public static void main(String[] args) {

		// varaible length of arguments int... marks
		// uses array internally to pass values from method
		// restriction is this var argument should be last parameter to work

		StudentArrayList student1 = new StudentArrayList("Sagar", 98, 99, 92);

		System.out.println(student1.getClass().getSimpleName());
		System.out.println("Student name : " + student1.getName());
		System.out.println("getnoOfsubjects :" + student1.getnoOfsubjects());
		System.out.println("getTotalMarksOfAllSubjects :" + student1.getTotalMarksOfAllSubjects());
		
		System.out.println("getMaxSubjectMark :" + student1.getMaxSubjectMark());
		System.out.println("getMinSubjectMark :" + student1.getMinSubjectMark());

		// use BigDecimal for floating point values
		BigDecimal avg = student1.avgMarkOfallSubjects();
		System.out.println("avg : " + avg);

		System.out.println("=======================================");
		StudentArrayList student2 = new StudentArrayList("Raju", 98, 99, 92, 52);

		System.out.println(student2.getClass().getSimpleName());
		System.out.println("Student name : " + student2.getName());
		System.out.println("getnoOfsubjects :" + student2.getnoOfsubjects());
		System.out.println("getTotalMarksOfAllSubjects :" + student2.getTotalMarksOfAllSubjects());
		System.out.println("avg : " + student2.avgMarkOfallSubjects());
		System.out.println("=======================================");

		StudentArrayList student3 = new StudentArrayList("Naresh", 98, 99, 92, 50, 37, 86);
		System.out.println(student3.getClass().getSimpleName());
		System.out.println("Student name : " + student3.getName());
		System.out.println("getnoOfsubjects :" + student3.getnoOfsubjects());
		System.out.println("getTotalMarksOfAllSubjects :" + student3.getTotalMarksOfAllSubjects());
		System.out.println("avg : " + student3.avgMarkOfallSubjects());

		System.out.println("student1 :" + student1);

		student1.addMarks(38);
		System.out.println("student1 :" + student1);
		student1.removeMarkAtIndex(0);
		System.out.println("student1 :" + student1);

	}

}
