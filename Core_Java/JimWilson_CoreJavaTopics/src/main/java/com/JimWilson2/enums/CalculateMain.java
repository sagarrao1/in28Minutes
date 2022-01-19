package com.JimWilson2.enums;

import java.util.Scanner;

public class CalculateMain {

	public static void main(String[] args) {
			
		/*  Her what happens is calling super class reference with derived class instance
		 * CalculateBase calculation = new Adder();
		 * calculation.calculate()  as we have override method in Adder class. it calls calculate() in Adder() class 
		 * 
		 */
//		CalculateBase adder = new Adder();
//		adder.setLeftVal(100.0d);
//		adder.setRightVal(2.0d);
//		adder.calculate();
//		System.out.println("calculation result: "+ adder.getResult());
//		
//		
//		CalculateBase devider = new Devide();
//		devider.setLeftVal(100.0d);
//		devider.setRightVal(2.0d);
//		devider.calculate();
//		System.out.println("calculation result: "+ devider.getResult());
		
//		all above we can write in better way by creating new static method doCalculation				

		
//		Adder adder =new Adder();
//		doCalculation(adder, 100.0d, 2.0d);
//
//		Devide devider=  new Devide();
//		doCalculation(devider, 100.0d, 2.0d);	
		
		
//		performMoreCalculations();

		
		
		
//		below is different context. Using Object reference type
		
//		Object o =  new CargoFlight();
//		o.add1Package(1.0f, 2.0f, 3.0f); // error as o is referring Object can't access CargoFlight method
		
//		if ( o instanceof CargoFlight) {
//			CargoFlight cf = (CargoFlight) o;		
//			cf.add1Package(1.0f, 2.0f, 3.0f);
//			System.out.println("if loop. executing add1package() ");
			
//		}		
		
		
//		Using MathOperation enums in calculate program whhich takes operaion and two number and does the calculation based on operation given
		executeInteractively();
		
}

	
	private static void executeInteractively() {
		System.out.println("Enter operation and two numbers");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		String[] parts = userInput.split(" ");
		performOperation(parts);
		scanner.close();
		
	}


	private static void performOperation(String[] parts) {
		MathOperation operation;
		try {
			operation = MathOperation.valueOf(parts[0].toUpperCase());
			double lf = Double.parseDouble(parts[1]);
			double rf = Double.parseDouble(parts[2]);
			CalculateBase calculation = createCalculation(operation, lf,rf);
			calculation.calculate();
			System.out.println(" result : "+calculation.getResult() + " for "+calculation.getClass().getSimpleName());
		} catch (IllegalArgumentException e) {
			System.out.println("Incorrect operation. it should be one of below");
			System.out.println("ADD , MULTIPLY, DEVIDE, SUBTRACT example: ADD 2 4");
//			e.printStackTrace();
		}
				
	}


	private static CalculateBase createCalculation(MathOperation operation, double leftV, double reghtV) {
		CalculateBase calBase=null;

		switch (operation) {
		case ADD:
			calBase = new Adder(leftV, reghtV);
			break;
		case MULTIPLY:
			calBase = new Multiply(leftV, reghtV);
			break;
		case DEVIDE:
			calBase = new Devide(leftV, reghtV);
			break;
		case SUBTRACT:
			calBase = new Subtract(leftV, reghtV);
			break;			
  			
		default:
			System.out.println("Incorrect operaion");
			break;
		}
		return calBase;
		
	}
	
	
	private static void performMoreCalculations() {
		CalculateBase[] calculations = {
				new Adder(100.0d, 2.0d),
				new Devide(100.0d, 2.0d),
				new Multiply(100.0d, 2.0d),
				new Subtract(100.0d, 2.0d),
		};
		
		System.out.println();
		System.out.println("Array of calculations");
		for (CalculateBase calculateBase : calculations) {
			calculateBase.calculate();
			System.out.println("calculateBase result: "+calculateBase.getResult()+ " for "+calculateBase.getClass().getSimpleName());
		}
	}

	private static void doCalculation(CalculateBase calculation, double leftV, double rightV) {
		calculation.setLeftVal(leftV);
		calculation.setRightVal(rightV);
		calculation.calculate();
		System.out.println("calculation result: "+calculation.getResult());
//		System.out.println(calculation.getClass().getSimpleName());
//		System.out.println("");
	}
	
	

}
