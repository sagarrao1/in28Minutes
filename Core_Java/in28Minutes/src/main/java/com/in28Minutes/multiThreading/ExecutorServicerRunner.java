package com.in28Minutes.multiThreading;
//ExecutorService class to control the thread execution

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicerRunner {

	public static void main(String[] args) {
//		We are using signleThread executor in this example
//		it will run only one Thread at at time

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task1());
		executorService.execute(new Thread (new Task2())); // we can this way or above way
		
		System.out.println("\nTask 3 Kicked off");
		for (int i = 301; i < 399; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask 3 Done");

		System.out.println("Main Task Done......");
		
		executorService.shutdown();


	}

}
