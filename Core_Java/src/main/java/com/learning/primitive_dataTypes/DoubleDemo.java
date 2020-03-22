package com.learning.primitive_dataTypes;

public class DoubleDemo {
	public static void main(String[] args) {
		float f = 24.5f;
		System.out.println(f);
		double d = 34.5678;
		System.out.println(d);

		f = (float) d;
		System.out.println(f);
		int i = (int) d;
		System.out.println(i);

		f = i;
		System.out.println(f);


	}

}
