package com.learning.refernceType;

public class StringBufferDemo {

	public static void main(String[] args) {
//     we can change the value of string. Stringbuffer is mutable
//     if we say "12"+"34"+"ab"+"xy"
//		It will be 1234abxy.  It will create 4 String objects. We are unnessarily creating string objects. 
//		To avoid that we can use StringBuffer.
//		StringBuffer is mutable
//		we can not use syntax like StringBuffer ="test"

		StringBuffer sb = new StringBuffer("Test");
		System.out.println(sb);
		sb.append(" 123");
		System.out.println(sb);
		sb.setCharAt(1, 'Z');
		System.out.println(sb);

	}

}
