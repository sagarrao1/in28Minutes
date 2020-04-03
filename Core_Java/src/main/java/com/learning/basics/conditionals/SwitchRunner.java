package com.learning.basics.conditionals;

public class SwitchRunner {

	public static void main(String[] args) {
		puzzle4a();
	}


	public static void puzzle3() {		
		int i=2;
		switch (i) {
		case 1:
			System.out.println( "1");
			break;
		case 2:			
		case 3:
			System.out.println( "number 2 and 3");
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}
	}

	public static void puzzle4() {		
		int i=10;
		switch (i) {
		case 1:
			System.out.println( "1");
			break;
		case 2:
			System.out.println( "2");
			break;
		case 3:
			System.out.println( "3");
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}
	}

	public static void puzzle4a() {
		int i = 10;
		switch (i) {
		default:
			System.out.println("Wrong choice");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		}
	}

	public static void puzzle5() {
		// can't use switch value type as long,float,double, boolean
//		long l = 1234l;
//		switch (l) {
//
//		}
	}

	public static void puzzle6() {
		int number = 10;
		int i = number * 2;

//		inside case you con't have condition
//		switch (number) {
//		case number > 5:
//			System.out.println("1");
//			break;
//		}
	}

}
