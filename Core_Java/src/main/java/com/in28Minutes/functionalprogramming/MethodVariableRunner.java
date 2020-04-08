package com.in28Minutes.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodVariableRunner {

	public static void main(String[] args) {		
		List<Integer> list= Arrays.asList(2,67,8,2,53,29,4,5,8);
		
//		1.Storing functions in variables
//		2.Passing functions to methods  
//			= > till we are doing this 2 point like below 1st example 
//		3.Returning functions from methods


//		Normal way
//		print even
		list.stream()
		    .filter(n -> n%2==0) // example to 2nd point above
		    .map(n -> n*n)
		    .forEach(e -> System.out.print(e +" "));
		
		System.out.println();		


//		Using same with Method variable//		
		Predicate<? super Integer> evenPredicate = n -> n%2==0;
		Predicate<? super Integer> oddPredicate = n -> n%2==0;
		
		list.stream()
		    .filter(evenPredicate) 
		    .map(n -> n*n)
		    .forEach(e -> System.out.print(e +" "));
		
		System.out.println();		



	}

}
