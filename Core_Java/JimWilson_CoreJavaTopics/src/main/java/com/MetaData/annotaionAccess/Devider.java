package com.MetaData.annotaionAccess;

@CommandKeyword(name = "devide")
public class Devider implements Calculator {

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		// TODO Auto-generated method stub
		return leftVal / rightVal;
	}

}
