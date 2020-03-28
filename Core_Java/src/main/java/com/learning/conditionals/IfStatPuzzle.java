package com.learning.conditionals;
public class IfStatPuzzle {
	public static void main(String[] args) {
		puzzle5();
	}

	public static void puzzle1() {
		int k = 15;
		// 2 and 3 are true but it will not check further if first true is condition
		if (k>20) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2);
		} else if (k < 20) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

	public static void puzzle2() {
		// we should always if { } to seperate multiple if statements

		int l = 15;
		if (l < 20)
			System.out.println("l< 20");
		if (l > 20)
			System.out.println("l>20");
		else
			System.out.println("else block");
	}

	public static void puzzle3() {
		int m = 15;
// better to use { } for single if statments 

//		if (m > 20)
//			if (m < 20)
//				System.out.println("m < 20");
//			else
//				System.out.println("else block");

		if (m > 20) {
			if (m < 20) {
				System.out.println("m < 20");
			} else {
				System.out.println("else block");
			}
		} else {
			System.out.println("1st if else block ");
		}

	}

	public static void puzzle4() {
//		we should use only condition
		int n = 4;
//		if (n) {
//		System.out.println();
//		}
	}

	public static void puzzle5() {
//	better to use { } for single if statments		
//	if we didn't use {} it will check only next line consider other line are
//	other than if block
		int number = 5;
//		if (number < 0)
//			number = number + 10;
//		number++;
//		System.out.println("number : " + number);

		if (number < 0) {
			number = number + 10;
		number++;
		System.out.println("number : " + number);
		}
		System.out.println("Else block numebr : " + number);
	}


}
