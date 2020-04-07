package com.in28Minutes.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FPNumbersRunner2 {

	// there can be any no.of intermediate stream, but only one terminal stream
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(2,67,8,53,29);
		List<Integer> list2= Arrays.asList(2,67,8,2,53,29,4,5,8);
		
		// intermedite opration sort
		list.stream().sorted().forEach(e -> System.out.print(e+" "));
		
		System.out.println();
		//distinct from list2
		list.stream().distinct().forEach(e -> System.out.print(e+" "));
		
		System.out.println();
		//distinct and sorted from list2
		list.stream().distinct().sorted().forEach(e -> System.out.print(e+" "));

		System.out.println();
		//distinct and square of each num from list2
		// we use map
		list.stream().distinct().map(e -> e*e).forEach(e -> System.out.print(e+" "));
	
		System.out.println();
		//distinct,sort, square of each num from list2
		// we use map
		list.stream().distinct().sorted().map(e -> e*e).forEach(e -> System.out.print(e+" "));

	}

}
