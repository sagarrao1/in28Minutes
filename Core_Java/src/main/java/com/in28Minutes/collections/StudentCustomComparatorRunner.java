package com.in28Minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparaotr implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}

}

class AscendingStudentNameComparaotr implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
//				(student1.getName() < student2.getName()) ? -1 :student1.getName() < student2.getName()?0:1 );
	}

}

public class StudentCustomComparatorRunner {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Sagar rao"));
		students.add(new Student(102, "Ranga rao"));
		students.add(new Student(3, "Aswini"));

// sorting using student class implementing comparable interface
//   If you want your own comparision with touching student class
//   you need to create custom class which implements comparator interface
//   and use that class in your sort method
//   sort is overload and 2 type 1. sort(), 2. sort(list, comparator)

		System.out.println(students);
//		sort students array using default Comparable by Id
		System.out.println("using sort logic of comparable interface in Student class");
		Collections.sort(students);
		System.out.println(students);


//		sort students array using Comparator by id
		System.out.println("sort students array using Comparator by Id");
		Collections.sort(students, new DescendingStudentComparaotr());
		System.out.println(students);

//		sort students array using Comparator by Name
//		we can use 2 ways 1. Collections.sort(stundents, comparator) 2. students(comparator)
		System.out.println("sort students array using Comparator by Name");
		students.sort(new AscendingStudentNameComparaotr());
		System.out.println(students);

	}

}
