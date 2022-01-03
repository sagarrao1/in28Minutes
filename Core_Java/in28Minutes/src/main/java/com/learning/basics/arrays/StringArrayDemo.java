package com.learning.basics.arrays;

import java.util.Arrays;

public class StringArrayDemo {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		
//		creating array of object is same like int array above
		Person[] persons= new Person[3];
		
		persons[0]=new Person();
		persons[1]=new Person();
		persons[2]=new Person();		
		System.out.println(Arrays.toString(persons));
		
//		another way of creating person object
//		creating 2 persons
		Person[] students = { new Person(), new Person() };
		System.out.println("students : " + Arrays.toString(students));
		
//		 with strings we can do same thing
//		 create array of strings. with string we do not need even new
		
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };
		System.out.println(Arrays.toString(daysOfWeek));
		System.out.println(daysOfWeek.length);
		String[] daysOfWeekBackwards = new String[7];

//		System.out.println(Arrays.toString(daysOfWeekBackwards));
		for (int i = daysOfWeek.length - 1, j = 0; i >= 0; i--, j++) {
			daysOfWeekBackwards[j] = daysOfWeek[i];
		}

		System.out.println(Arrays.toString(daysOfWeekBackwards));
		
//		daysWithMostCharacters
		System.out.println("===daysWithMostCharacters=========");
		String daysWithMostCharacters = "";
		System.out.println("daysWithMostCharacters:" + daysWithMostCharacters);
		System.out.println(daysWithMostCharacters.length());

		for (String day : daysOfWeek) {
			if (day.length() > daysWithMostCharacters.length()) {
				daysWithMostCharacters = day;
			}
		}
		System.out.println("daysWithMostCharacters:" + daysWithMostCharacters);
		System.out.println(daysWithMostCharacters.length());
	}


}
