package com.MetaData.annotaionAccess;

@CommandKeyword(name = "multiply")
public class Multiply implements Calculator {

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		// TODO Auto-generated method stub
		return leftVal * rightVal;
	}

}
