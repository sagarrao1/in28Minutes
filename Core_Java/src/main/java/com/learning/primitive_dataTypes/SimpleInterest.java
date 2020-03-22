package com.learning.primitive_dataTypes;
import java.math.BigDecimal;

public class SimpleInterest {
	BigDecimal principle; // 4500
	BigDecimal interest; // 7.5

	public SimpleInterest(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfyears) {
		BigDecimal yearsBigDecimal = new BigDecimal(noOfyears);
		BigDecimal totalInterest = principle.multiply(interest).multiply(yearsBigDecimal);
		return principle.add(totalInterest);
	}

}
