package com.in28Minutes.collections;

public class Student implements Comparable<Student> {
	private int id;
	private String name;


	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student that) {
//		return ((this.id < that.id) ? -1 : (this.id == that.id) ? 0 : 1); // old way
		return Integer.compare(this.id, that.id); // new way from 1.7
		// for reverse you just need to reverse (that.is,this.id)
	}


}
