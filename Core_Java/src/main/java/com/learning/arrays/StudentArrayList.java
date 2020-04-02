package com.learning.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

// changing code from Array to arrayList
public class StudentArrayList {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentArrayList(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	// get no. of subjects that student has
	public int getnoOfsubjects() {
		// length is Array property
		// length() is method of String
		// size is arrayList method
//		return marks.length; 
		return marks.size();
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
//		int max = Integer.MIN_VALUE;
//		for (int mark : marks) {
//			if (mark > max) {
//				max = mark;
//			}
//		}
//		return max;
		return Collections.max(marks);
	}

	public int getMinSubjectMark() {
//		int min = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (mark < min) {
//				min = mark;
//			}
//		}
//		return min;
		return Collections.min(marks);
	}

	public BigDecimal avgMarkOfallSubjects() {
		int number = getnoOfsubjects();
		int sum = getTotalMarksOfAllSubjects();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return "StudentArrayList [name=" + name + ", marks=" + marks + "]";
	}

	public void addMarks(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}
