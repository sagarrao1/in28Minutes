package com.JimWilson2.classes;

public class Main {

	public static void main(String[] args) {
		
		MathExecution[] executions= new MathExecution[4];
//		executions[0]=  new MathExecution();
//		executions[0].leftVal= 20d;
//		executions[0].rightVal=5d;
//		executions[0].opCode='m';
//		
		executions[0]=new MathExecution(20d,5d,'m');
		executions[1]=new MathExecution(10d,3d,'d');
		executions[2]=new MathExecution(30d,8d,'a');
		executions[3]=new MathExecution(50d,19d,'d');
		
		for (MathExecution mathExecution : executions) {
			double result = mathExecution.execute();
			System.out.println("result : "+result);
		}		
	
//		double result = executions[0].execute();
//		System.out.println("result : "+result);

	}
	
	
//	static MathExecution create(double l, double r, char c ) {
//		MathExecution exection = new MathExecution();
//		exection.leftVal=l;
//		exection.rightVal=r;
//		exection.opCode=c;		
//		return exection;
		
//	}

}
