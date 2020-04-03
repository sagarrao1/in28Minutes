package com.learning.basics.primitive_dataTypes;

public class PrePostIncrement {

	public static void main(String[] args) {
		int i = 10;
		// post increment
		int j = i++;
		System.out.println("j=" + j);
		System.out.println("i=" + i);
		System.out.println("===============");
		// Pre Increment
		i = 10;
		j = ++i;
		System.out.println("j=" + j);
		System.out.println("i=" + i);

		System.out.println("Pre Decrement===============");
		// Pre Decrement
		i = 10;
		j = --i;
		System.out.println("j=" + j);
		System.out.println("i=" + i);
		System.out.println("Post Decrement===============");
		// Post Decrement
		i = 10;
		j = i--;
		System.out.println("j=" + j);
		System.out.println("i=" + i);

	}

}
