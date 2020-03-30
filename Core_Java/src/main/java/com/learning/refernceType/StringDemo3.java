package com.learning.refernceType;

public class StringDemo3 {

	public static void main(String[] args) {
		String str = "";
		String str1 = str.join(",", "2", "3", "4");
		System.out.println(str1);

		String str2 = str.join(",", "A", "B", "C");
		System.out.println(str2);

		String abc = "abcd";
		System.out.println(abc.replace("abcd", "xyz"));
		System.out.println(abc.replace('a', 'z'));
	}

}
