package com.learning.basics.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(4);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime :" + isPrime);

		// 1+2+3+4 = 10
		int sum = number.sumUptoN();
		System.out.println("sum :" + sum);

		int sumDivisor = number.sumOfdivisors();
		System.out.println("sum of divisors :" + sumDivisor);

		number.printANumberTriangle();

	}

}
