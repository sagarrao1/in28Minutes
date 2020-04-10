package com.in28Minutes.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {	
		Scanner scanner=null;
		
		try {
			scanner= new Scanner(System.in);
			int[] number= {1,2,3};
			int n= number[5];			
			System.out.println("Before scanner.close()");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("finally block before scanner.close()");
			if (scanner !=null) {
				System.out.println("scanner is not null, so closing the scanner");
				scanner.close();
			}
		}
		
		System.out.println("end of program...");
		
	}
//	output
//	java.lang.ArrayIndexOutOfBoundsException: 5
//	at com.in28Minutes.exceptionhandling.FinallyRunner.main(FinallyRunner.java:13)
//	finally block before scanner.close()
//	end of program...


}
