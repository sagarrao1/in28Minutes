package com.learning.basics.refernceType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaDatesDemo2 {

	public static void main(String[] args) {
		// Java Dates are immutable

		LocalDate today = LocalDate.now();
		LocalDate someDate = LocalDate.of(2020, 03, 25);
		System.out.println(today);
		System.out.println(someDate);
		System.out.println("withYear:" + someDate.withYear(2016));
		System.out.println("withDayOfMonth:" + someDate.withDayOfMonth(9));
		System.out.println("withDayOfYear:" + someDate.withDayOfYear(120));
		System.out.println("lengthOfYear:" + someDate.lengthOfYear());
		System.out.println("getDayOfWeek:" + someDate.getDayOfWeek());

		System.out.println("today.isBefore(someDate) :" + today.isBefore(someDate));
		System.out.println("today.isAfter(someDate):" + today.isAfter(someDate));

		List list = new ArrayList<>();
	}

}
