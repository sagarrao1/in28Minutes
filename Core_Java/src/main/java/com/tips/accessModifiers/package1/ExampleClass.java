package com.tips.accessModifiers.package1;

// sample methods created with different method access modifiers
public class ExampleClass {
	
	public void publicMethod() {}
	private void privateMethod() {}
	protected void protectedMethod() {}
	void defaultMethod() {}

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		
		// we can access all types of methods in same class
		exampleClass.publicMethod();
		exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
	}
}
