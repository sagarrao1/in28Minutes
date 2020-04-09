package com.in28Minutes.multiThreading;
//ExecutorService class to control the thread execution

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Using Thread class
class Task extends Thread{
	
	private int number;

	public Task(int number) {
		this.number=number;
	}
	
	public void run() {  // signature should match
		System.out.println("\nTask "+ number +" Started ...");
		for (int i = number*100; i < (number*100) + 99; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask "+ number +" Done");
	}
}



public class ExecutorMutltiThreadRunner {

	public static void main(String[] args) {
//		We are using FixedThreadPool executor in this example
//		at max no. threads to run is mentioned in FixedThreadPool(2)

//		ExecutorService executorService = Executors.newFixedThreadPool(2);
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2)); 		
		executorService.execute(new Task(3));		
		executorService.execute(new Task(4));
		executorService.execute(new Task(5)); 		
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		executorService.execute(new Task(8)); 		
		executorService.execute(new Task(9));
		
		
		executorService.shutdown();


	}

}
