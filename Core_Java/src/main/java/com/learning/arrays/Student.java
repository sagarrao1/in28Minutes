package com.learning.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	// get no. of subjects that student has
	public int getnoOfsubjects() {
		return marks.length;
	}

	// get Total marks of all subjects
	public int getTotalMarksOfAllSubjects() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaxSubjectMark() {
		int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
	}

	public int getMinSubjectMark() {
		int min = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
	}

	// we need to BigDecimal divide() to get avg in fraction values
	// need to use precision and round not to get exception
	// like to avoid 96.6666666.....
	// precision and rounding values will tell how many digits you want to round off
	public BigDecimal avgMarkOfallSubjects() {
		int number = getnoOfsubjects();
		int sum = getTotalMarksOfAllSubjects();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

}
