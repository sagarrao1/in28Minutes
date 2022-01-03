package com.tips.nestedclass;

  
/* default class and visibility of this default class 
in within the package*/
class Default {
	
}

public class NestedClassRunner {
	
	private int nestclassRunnVar= 13;
	/* Anything nested inside a class in called nested class
	 * 2 types of nested classes
	 * 1.Inner class which can be instantiated with  only current 
	 * class is created
	 * 2. Static InnerClass is like normal static class where
	 * we cannot access instance variables and visibility to is to this class only
	 *Java allows a class to be defined within another class. These are called Nested Classes. The class in which the nested class is defined is known as the Outer Class. Unlike top level classes, Inner classes can be Static. Non-static nested classes are also known as Inner classes.
	An instance of an inner class cannot be created without an instance of the outer class. Therefore, an inner class instance can access all of the members of its outer class, without using a reference to the outer class instance. For this reason inner classes can help make programs simple and concise.
	You cannot use the static keyword with a class unless it is an inner class.
	
	What are the differences between static and non-static nested classes?
	The following are major differences between static nested classes and inner classes.
		1. A static nested class may be instantiated without instantiating its outer class.
		2. Inner classes can access both static and non-static members of the outer class. A static class can access only the static members of the outer class.
	 * */
	class InnerClass{
		int i=6;
		
		int k=nestclassRunnVar;
		
	}

	static class StaticNestedClass{		
		int j=5;
//		int p=nestclassRunnVar;
//		not alloweed from static class because we are making non static reference from static
	}
	
	public static void main(String[] args) {
		
//		InnerClass innerClass = new InnerClass();
//		not accessible directly as we did not create instance of NestedClassRunner

		StaticNestedClass staticNestedClass= new StaticNestedClass();
		System.out.println(staticNestedClass.j);
		
		NestedClassRunner outerClass=  new NestedClassRunner();
		InnerClass innerClass = outerClass.new InnerClass();
		System.out.println(innerClass.i);
		System.out.println("k : "+innerClass.k);

	}

}

