package com.learning.basics.primitive_dataTypes;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		double d1 = 34.34567875667;
		double d2 = 12.22345555;
		System.out.println(d1 + d2);
		BigDecimal number1 = new BigDecimal("34.34567875667");
		BigDecimal number2 = new BigDecimal("12.22345555");
		BigDecimal number3 = number1.add(number2);
		System.out.println(number3);
		System.out.println(number3.doubleValue());
		System.out.println("==================");
		BigDecimal number4 = number3.multiply(new BigDecimal(100));
		System.out.println(number4);

	}

}
