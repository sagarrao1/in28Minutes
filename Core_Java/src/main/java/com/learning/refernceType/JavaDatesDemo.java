package com.learning.refernceType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaDatesDemo {

	public static void main(String[] args) {
		// LocalDate, LocalDateTime, LocalTime
//		 all above three classes are immutable
		
		LocalDate date= LocalDate.now();
		System.out.println("date :" + date);
		System.out.println(LocalDate.now()); // another way
		
		LocalDateTime dTime = LocalDateTime.now();
		System.out.println("dTime:" + dTime);
		
		System.out.println("time :" + LocalTime.now());
		
//		================================================
		System.out.println("==================================");
		
		LocalDate today = LocalDate.now();
		System.out.println("today:" + today);
		System.out.println("getDayOfMonth:" + today.getDayOfMonth());
		System.out.println("getYear:" + today.getYear());
		System.out.println("getMonth:" + today.getMonth());
		System.out.println("getDayOfYear:" + today.getDayOfYear());
		System.out.println("getDayOfWeek:" + today.getDayOfWeek());
		System.out.println("getMonthValue:" + today.getMonthValue());
		System.out.println("isLeapYear:" + today.isLeapYear());
		System.out.println("lengthOfMonth:" + today.lengthOfMonth());
		System.out.println("lengthOfYear:" + today.lengthOfYear());

		System.out.println("plusDays:" + today.plusDays(12));
		System.out.println("plusMonths:" + today.plusMonths(12));
		System.out.println("plusYears:" + today.plusYears(12));
		System.out.println("minusDays:" + today.minusDays(12));
		System.out.println("minusMonths:" + today.minusMonths(12));

		System.out.println("========================");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.plusMinutes(10));

		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		System.out.println(nowTime.plusNanos(120000));

	}

}
