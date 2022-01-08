package com.JimWilson2.inheritence;

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

		
		Adder adder =new Adder();
		doCalculation(adder, 100.0d, 2.0d);

		Devide devider=  new Devide();
		doCalculation(devider, 100.0d, 2.0d);	
		
		
		performMoreCalculations();

		
		
		
//		below is different context. Using Object reference type
		
//		Object o =  new CargoFlight();
//		o.add1Package(1.0f, 2.0f, 3.0f); // error as o is referring Object can't access CargoFlight method
		
//		if ( o instanceof CargoFlight) {
//			CargoFlight cf = (CargoFlight) o;		
//			cf.add1Package(1.0f, 2.0f, 3.0f);
//			System.out.println("if loop. executing add1package() ");
			
//		}		
		
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
