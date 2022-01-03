package com.in28Minutes.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FPOptionalRunner {

	public static void main(String[] args) {
		List<Integer> list1= Arrays.asList(1,3,5,7);
		List<Integer> list2= Arrays.asList(8,2,67,53,29);
		
//		print even numbers with optional return
		Boolean value= list1.stream().filter(e -> e%2 ==0).min((n1,n2) -> Integer.compare(n1,n2)).isPresent();
		System.out.println("isPresent :"+value);
		
		//print even numbers with optional return 
		Integer min= list2.stream().filter(e -> e%2 ==0).min((n1,n2) -> Integer.compare(n1,n2)).orElse(0);
		System.out.println("min :"+min);

		value= list2.stream().filter(e -> e%2 ==0).min((n1,n2) -> Integer.compare(n1,n2)).isPresent();
		System.out.println("isPresent :"+value);
		
		
	}

}
