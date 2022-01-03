package com.tips.accessModifiers.package1;

public class MethodAccessRunnerInsideSamePkg {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		
		// we can access all types of methods in same class
		exampleClass.publicMethod();
		//exampleClass.privateMethod();
//		we can't access private methods in different package
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();

	}

}
