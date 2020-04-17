package com.tips.nonaccessModifiers.package1;

// there are non access modifiers which are final and static
// 1. final class 2. final methods 3. final variables

//1. final class 
final class FinalClass{
	
}
// we can't extend final class
// example of final classes are String ,Integer
/* class someClass extends FinalClass{ }  */

//2. final methods 
class someClass {
	final public void doSomthing() {}	
	
	public void doSomthing(final int i) { // final argument
		//i=7; // you can't change as it final argument
		
	}
}
// when we make final in super class. we can't override in sub class

class extendClass extends someClass{
//	can't override
//	public void doSomthing() {}
	
	
	public static void main(String[] args) {
		someClass c=  new someClass();
		c.doSomthing();
	}
	
	
}

// 3. final variables
public class FinalNonAccessModifierRunner {

	public static void main(String[] args) {
		// final variables
		final int i =5;
//		i=7; // not  allowed as it if final

	}

}
