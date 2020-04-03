package com.in28Minutes.oops.interfaces.java8Interface;

public class Test implements Interface4 {

//	If we did not override print method
//	it will get it from interface default print method

	@Override
	public void print() {
		System.out.println("Test class print method");
//		Interface4.super.print();
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.print();
	}
}
