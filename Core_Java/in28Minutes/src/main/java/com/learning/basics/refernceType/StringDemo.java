package com.learning.basics.refernceType;

public class StringDemo {

	public static void main(String[] args) {
		// String is special class in java
		// both are same
		String str= "Test";
		String str1= new String("this is new test");
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5, 10));

//		for (int i = 0; i < str1.length(); i++) {
//			System.out.println(str1.charAt(i));
//		}

//		"this is new test"

		System.out.println(str1.indexOf("new"));
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.indexOf('t'));
		System.out.println(str1.lastIndexOf('t'));

//	"this is new test"
		System.out.println("*******************");
		System.out.println(str1.startsWith("new"));
		System.out.println(str1.startsWith("this"));
		System.out.println(str1.startsWith("hgjgj"));
		System.out.println(str1.endsWith("new"));
		System.out.println(str1.endsWith("test"));

		System.out.println("contains :" + str1.contains("new"));

//		"this is new test"
		System.out.println("===================");
		System.out.println(str1.isEmpty());

		String str2 = "value";
		boolean compareString = str2.equals("value");
		boolean compareString2 = str2.equalsIgnoreCase("Value");

		System.out.println("compareString :" + compareString);
		compareString = str2.equals("Value");
		System.out.println("compareString :" + compareString);
		System.out.println("compareString2 :" + compareString2);
	}
}
