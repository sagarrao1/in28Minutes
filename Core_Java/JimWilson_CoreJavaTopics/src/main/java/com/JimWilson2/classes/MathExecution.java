package com.JimWilson2.classes;

public class MathExecution {
	
	private double leftVal;
	private double rightVal;
	private char opCode;
	private double result;	
	
	public MathExecution(double leftVal, double rightVal, char opCode) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		this.opCode = opCode;
	}

	public double getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}

	public double getRightVal() {
		return rightVal;
	}

	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}

	public char getOpCode() {
		return opCode;
	}

	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}

	public double execute() {
		 double result;
	        switch (opCode) {
	            case 'a':
	                result = leftVal + rightVal;
	                break;
	            case 's':
	                result = leftVal - rightVal;
	                break;
	            case 'm':
	                result = leftVal * rightVal;
	                break;
	            case 'd':
	                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
	                break;
	            default:
	                System.out.println("Invalid opCode: " + opCode);
	                result = 0.0d;
	                break;
	        }
	        return result;
	    }

}
