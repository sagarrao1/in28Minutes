package com.learning.basics.refernceType;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "in28Minutes";
		System.out.println(str.concat(" is awesome"));
		System.out.println(str);
		String anotherString = str.concat(" is awesome course");
		System.out.println(anotherString);
		String str2 = anotherString.concat(" . **");
		System.out.println(str2);

		System.out.println("str:" + str);
		System.out.println("anotherString:" + anotherString);
		System.out.println("str2:" + str2);
		System.out.println("===================");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		String str3 = " sagar  ";
		System.out.println(str3);
		System.out.println(str3.trim()); // removes spaces
	}

}
