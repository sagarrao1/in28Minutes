package com.learning.primitive_dataTypes;

public class BiNumberRunner {
	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println("add:" + numbers.add());
		System.out.println("multiply:" + numbers.multiply());
		numbers.doubleNumbers();
		System.out.println("i1:" + numbers.getNum1());
		System.out.println("i2:" + numbers.getNum2());

	}
}
