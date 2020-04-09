package com.in28Minutes.multiThreading;

public class ThreadBasicsRunner {
	// Lets assume all 3 tasks are independent of each other
	// This example shows all tasks are done in sequentially
	// next example ThreadBasicsRunner1 is done with threads which will be done executing 3 tasks parallel using threads
	
	public static void main(String[] args) {
		// Task 1
		for (int i = 101; i < 199; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask 1 Done");
		
		// Task 2
		for (int i = 201; i < 299; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask 2 Done");

		// Task 3
		for (int i = 201; i < 399; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask 3 Done");

		System.out.println("Main Task Done......");
	}

}
