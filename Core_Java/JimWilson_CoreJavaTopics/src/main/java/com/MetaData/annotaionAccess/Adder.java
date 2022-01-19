package com.MetaData.annotaionAccess;

@CommandKeyword(name = "add")
public class Adder implements Calculator {

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		return leftVal + rightVal;
	}

}
