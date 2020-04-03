package com.learning.basics.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {

		if (number < 2) {
			return false;
		}

		boolean result = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				result = false;
			}
		}

		return result;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfdivisors() {
		int sumD = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
				sumD += i;

			}
		}

		return sumD;
	}

	public void printANumberTriangle() {
		// for 4
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}


	}

}


