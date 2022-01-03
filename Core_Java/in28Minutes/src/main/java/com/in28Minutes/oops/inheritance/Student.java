package com.in28Minutes.oops.inheritance;

public class Student extends Person {

	private String collegeName;
	private int year;

	public Student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
		System.out.println("Student constructor");
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", year=" + year + ", toString()=" + super.toString() + "]";
	}



}
