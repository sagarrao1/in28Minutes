package com.in28Minutes.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumbersRunner4 {

	// there can be any no.of intermediate stream, but only one terminal stream
	public static void main(String[] args) {
		List<String> list= Arrays.asList("Apple","Bat","Rat");
		List<Integer> list2= Arrays.asList(2,67,8,2,53,29,4,5,8);
		
		//print min
		Integer min= list2.stream().min((n1,n2) -> Integer.compare(n1,n2)).get();
		System.out.println("min :"+min);

		//print odd number
		list2.stream().filter(e -> e%2 !=0).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//get odd numbers and create another list
		List<Integer> list3 = list2.stream().filter(e -> e%2 !=0).collect(Collectors.toList());
		System.out.println(list3);		

		//get even numbers and create another list
		List<Integer> list4 = list2.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
		System.out.println(list4);		
		
		// squares of first 10 numbers
		System.out.println("squares of first 10 numbers:");
		IntStream.range(1, 11).map(e -> e*e).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		// squares of first 10 numbers in a list
		System.out.println("squares of first 10 numbers in a List:");
		List<Integer> list5 = IntStream.range(1, 11).map(e -> e*e).boxed().collect(Collectors.toList());
		System.out.println(list5);
		
	}

}
