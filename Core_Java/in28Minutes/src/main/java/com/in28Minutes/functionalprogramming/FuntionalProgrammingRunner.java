package com.in28Minutes.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FuntionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog", "Rat");

		List<Integer> list2 = Arrays.asList(3, 4, 23, 6);
//		printBasic(list);
//		printFP(list);
//		printFPlist2(list2);
//		printBasicWithFiltering(list);
//		printBasicWithFilteringFP(list);
//		printOddNumbersFP(list2);
		printEvenNumbersFP(list2);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

//	we are passing function as parameter to another function (foreach) 
	private static void printFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

//	we are passing function as parameter to another function (foreach) 
	private static void printFPlist2(List<Integer> list2) {
		list2.stream().forEach(element -> System.out.println(element));
	}

//	Filtering with Funtional programming
	private static void printBasicWithFilteringFP(List<String> list) {
		list.stream()
				.filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println(element));
	}
	
//	Filtering with Funtional programming
//	Print only odd numbers
	private static void printOddNumbersFP(List<Integer> list2) {
		list2.stream()
				.filter(element -> (element%2 !=0))
				.forEach(element -> System.out.println(element));
	}

//	Filtering with Funtional programming
//	Print only odd numbers
	private static void printEvenNumbersFP(List<Integer> list2) {
		list2.stream()
				.filter(element -> (element%2 ==0))
				.forEach(element -> System.out.println(element));
	}

}
