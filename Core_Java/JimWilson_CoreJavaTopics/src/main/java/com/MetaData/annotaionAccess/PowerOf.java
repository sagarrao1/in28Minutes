package com.MetaData.annotaionAccess;

@CommandKeyword(name = "power")
public class PowerOf implements Calculator {

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		// TODO Auto-generated method stub
		return Math.pow(leftVal, rightVal);
	}

}
