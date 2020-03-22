package com.learning.primitive_dataTypes;

public class primitiveTest {

	public static void main(String[] args) {

		System.out.println(Byte.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Long.SIZE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		int i = 10000;
		long l = 5000000000l;
		System.out.println(l);
		i = (int) l;
		System.out.println(i);

		byte b = 125;
		b = (byte) i;
		System.out.println(b);

	}

}
