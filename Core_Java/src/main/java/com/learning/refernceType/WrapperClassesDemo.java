package com.learning.refernceType;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer hundred = Integer.valueOf("100");
		System.out.println(hundred);
		
//		1  1  1
//		2 the power 2 + 2 the power 1 + 2 the power 0 
//		4 	+ 2 + 1 = 7
//		valueOf(v, i ) is method to convert binary to decimal (integer)

		Integer seven = Integer.valueOf("111", 2);
		System.out.println(seven);

		Integer thirteen = Integer.valueOf("111", 3); // 13
		System.out.println("thirteen :" + thirteen);

		hundred = Integer.valueOf("100", 2); // 4
		System.out.println(hundred);

		System.out.println(seven.toString());

		Boolean value = Boolean.valueOf("true");
		System.out.println("value : " + value);

//		There are 2 ways to create object of wrapper classes
//
//		 1.  Integer integer1 = new Integer(5);   // it uses constructor to created object
//		 2. Integer integer1 =  Integer.valueOf(5);   // it creates static method in Integer class
		System.out.println("===========================");
		Integer integer1 = new Integer(5);
		System.out.println(integer1);
		Integer integer2 = Integer.valueOf(6);
		System.out.println(integer2);
		Integer integer3 = Integer.valueOf("1234"); // it can take string as well
		System.out.println("integer3 :" + integer3);


		System.out.println("*****************************");
//		each wrapper class have static method valueOf()
//		Which one to use and what is difference ?
//		Wrapper classes are also immutable
		Integer i1 = new Integer(7);
		Integer i2 = new Integer(7);

		Integer i3 = Integer.valueOf(67);
		Integer i4 = Integer.valueOf(67);

		boolean result1 = (i1 == i2); // false
		System.out.println("result1 of (i1 == i2):" + result1);
		boolean result2 = (i3 == i4); // true
		System.out.println("result2 of (i3 == i4):" + result2);

//		Better to use valueOf to creat object.if it finds same object(7). it will try to use it
//		it will not create new object.	Wrapper classes are also immutable
//		it is safe to use valueOf method
//		1st methods will create new object even though value is same

		System.out.println("&&&&&&&&&&&&&&&&&&&&&"); // only Char constructor
		Character ch = new Character('d'); // only Char constructor
//		Character ch1 = new Character(123); // compiler error
		
//		"true"  "True" "TURe" "tRUE" all string values are true
//		any other will be false
		Boolean b = new Boolean("true"); // value stored true
		Boolean b1 = new Boolean("True"); // value stored true
		Boolean b2 = new Boolean("trUe"); // value stored true
		System.out.print(b1 + " " + b1 + " " + b2);
		System.out.println();

		Boolean b3 = new Boolean("False"); // value stored false
		Boolean b4 = new Boolean("somthing"); // value stored false
		System.out.print(b3 + " " + b4);
	}

}
