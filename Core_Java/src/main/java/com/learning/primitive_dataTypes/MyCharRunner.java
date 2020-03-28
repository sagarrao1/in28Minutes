package com.learning.primitive_dataTypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('t');
		System.out.println("isVowel : " + myChar.isVowel());
		// 'a' ,'e' ,'i', 'o','u' and Capitals

		System.out.println("isDigit : " + myChar.isDigit());
		System.out.println("isAplhabet : " + myChar.isAplhabet()); // a to z or A to 'Z'

		char dh = 122;
		System.out.println(dh);
		System.out.println("isConsonant : " + myChar.isConsonant());

		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
		System.out.println();
		
		char ch2 = '\u00A2';
		System.out.println("ch2 : " + ch2);

	}

}
