package com.MetaData.annotaionAccess;

@CommandKeyword(name = "subtract")
public class Subtractor implements Calculator {

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		// TODO Auto-generated method stub
		return leftVal - rightVal;
	}

}
