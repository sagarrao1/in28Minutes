package com.learning.basics.primitive_dataTypes;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'U' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		} else {
			return false;
		}
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) { // '0' to '9'
			return true;
		} else
			return false;
	}

	public boolean isAplhabet() {
//		65 to 90 and 97 to 122
		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) { // 'a' to 'z' or 'A' to 'Z'
			return true;
		} else
			return false;
	}

	public boolean isConsonant() {
		if (this.isAplhabet() && !this.isVowel())
			return true;
		else
			return false;
	}

	public static void printLowerCaseAlphabets() {
//		char la = 97;
//		for (int i = 1; i <= 26; i++) {
//			System.out.print(la + ", ");
//			la++;
//		}
		
		for (char la = 'a'; la <= 'z'; la++) {
			System.out.print(la + ", ");
		}
		System.out.println();
	}

	public static void printUpperCaseAlphabets() {
		char la = 65;
		for (int i = 1; i <= 26; i++) {
			System.out.print(la + ", ");
			la++;
		}

	}

}
