package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		
		int[] nums= {12,4,6};		
//		BinarySearchImpl binarySearch= new BinarySearchImpl(new QuickSortAlgorithm());		
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);	
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);	
		System.out.println("bean 1: "+binarySearchImpl);
		System.out.println("bean 2: "+binarySearchImpl1);
		
		int result = binarySearchImpl.binarySearch(nums, 3);
		
		//com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@15db9742
		System.out.println("Result: "+result);
		
		
		
	}

}
