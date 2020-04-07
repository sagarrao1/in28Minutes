package com.in28Minutes.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FPNumbersRunner3 {

	// there can be any no.of intermediate stream, but only one terminal stream
	public static void main(String[] args) {
		List<String> list= Arrays.asList("Apple","Bat","Rat");
		List<Integer> list2= Arrays.asList(2,67,8,2,53,29,4,5,8);
		
		// Print square of first 10 numbers
		IntStream.range(1, 11).map(p -> p*p).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//Print words in lower case
		list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		
		//Print length of each stream
		list.stream().map(e -> e.length()).forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//Terminal functions
		//sum of first 10 numbers
		Integer sum= IntStream.range(1, 11).reduce(0, (n1,n2) -> n1+n2);
		System.out.println("sum :"+sum);

		//sum of first 10 numbers
		Integer max= list2.stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
		System.out.println("max :"+max);

		//sum of first 10 numbers
		Integer maxOf10= IntStream.range(1, 11).reduce(0,(n1, n2) -> (n1>n2? n1:n2));
		System.out.println("max of first 10 :"+maxOf10);
	}

}
