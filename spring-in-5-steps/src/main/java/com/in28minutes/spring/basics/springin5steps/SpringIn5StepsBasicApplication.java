package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int[] nums= {12,4,6};		
//		BinarySearchImpl binarySearch= new BinarySearchImpl(new QuickSortAlgorithm());		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);				
						
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);	
//		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);	
		System.out.println("bean 1: "+binarySearchImpl);
//		System.out.println("bean 2: "+binarySearchImpl1);
		
		int result = binarySearchImpl.binarySearch(nums, 3);
		
		//com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@15db9742
		System.out.println("Result: "+result);
		
		
		
	}

}
