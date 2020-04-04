package com.in28Minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
		// be deafult Integer collection we sort as

		List<Integer> numbers = new ArrayList<>();
		numbers.add(101);
		numbers.add(102);
		numbers.add(301);
		numbers.add(402);
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);

		System.out.println("===============");

		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Sagar rao"));
		students.add(new Student(102, "Ranga rao"));
		students.add(new Student(3, "Saju"));

		System.out.println(students);

		// when I try to sort Collections.sort it gives me error
//		in order to use we need to implement Comperabe interface for student class
//		it has method CompareTo method ,which we need to tell how to compare
//		each student when sorting
//		it worked for Integer because Integer class has implemented Comperable

		Collections.sort(students);
		System.out.println(students);

	}

}
