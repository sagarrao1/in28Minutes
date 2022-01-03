package com.tips.accessModifiers.package2;

import com.tips.accessModifiers.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPkg {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		
		// we can access all types of methods in same class
		exampleClass.publicMethod();
//		exampleClass.privateMethod();
//		we can't access private methods in different package
//		exampleClass.protectedMethod();
//		exampleClass.defaultMethod();
		
// you can access public methods from anywhere
// private methods are accessible from only that class
// protected methods are accessible from either same package
//		or  it's sub classes
// default methods are accessible from with that package

	}

}
