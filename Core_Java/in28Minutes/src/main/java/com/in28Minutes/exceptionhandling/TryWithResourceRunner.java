package com.in28Minutes.exceptionhandling;

import java.util.Scanner;

// Try with resource is new feature in java 7
// we can try below commented code with new feature. 
// we can use this try only with class which implements Closeable interface
// closeabe extends auto closable
// with this what we are doing in finally block we can do this simple step
// No need to write finally block

public class TryWithResourceRunner {

	public static void main(String[] args) {	
	
		try(Scanner scanner= new Scanner(System.in)){
			int[] number= {1,2,3};
			int n= number[5];			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// No need to write finally block
		
		System.out.println("end of program...");
	}	
		
		
//		Scanner scanner=null;		
//		try {
//			scanner= new Scanner(System.in);
//			int[] number= {1,2,3};
//			int n= number[5];			
//			System.out.println("Before scanner.close()");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			System.out.println("finally block before scanner.close()");
//			if (scanner !=null) {
//				System.out.println("scanner is not null, so closing the scanner");
//				scanner.close();
//			}
//		}
		
//		System.out.println("end of program...");
		
//	}
//	output
//	java.lang.ArrayIndexOutOfBoundsException: 5
//	at com.in28Minutes.exceptionhandling.FinallyRunner.main(FinallyRunner.java:13)
//	finally block before scanner.close()
//	end of program...


}
