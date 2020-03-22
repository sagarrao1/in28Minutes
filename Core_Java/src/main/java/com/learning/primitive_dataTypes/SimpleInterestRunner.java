package com.learning.primitive_dataTypes;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		// We want to calculate simple interest for 5 years for 7.5% interest
		// and principle amouunt 4500
		SimpleInterest si = new SimpleInterest("4500","7.5");
		BigDecimal totalValue = si.calculateTotalValue(5);

		// 6187.5
		System.out.println(totalValue);
	}

}
