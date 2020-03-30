package com.learning.refernceType;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		// Both below are same
		Integer i1 = Integer.valueOf(6);

		Integer i2 = 6; // Auto Boxing. equals to above statement

		System.out.println("both same : " + (i1 == i2));

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);

	}

}
