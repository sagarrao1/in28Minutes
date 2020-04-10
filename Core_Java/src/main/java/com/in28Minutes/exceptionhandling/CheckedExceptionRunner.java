package com.in28Minutes.exceptionhandling;

//when we try to use Thread.sleep method
// it is giving compilation error saying either you need to try catch or throws
// means either you need to handle or throw it to calling method
//  it forcing to handle exception . this is called checked exception
public class CheckedExceptionRunner {

	public static void main(String[] args) {
		try {
			someOtherMethod1();
			System.out.println("In Main method sleep 5 sec ");
			Thread.sleep(5000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
//		someOtherMethod2();
		System.out.println("End of program...");
	}

	private static void someOtherMethod2() throws RuntimeException{		
		
	}

	private static void someOtherMethod1() throws InterruptedException {
		System.out.println("In someOtherMethod1 ");
		Thread.sleep(2000);		
	}

}
