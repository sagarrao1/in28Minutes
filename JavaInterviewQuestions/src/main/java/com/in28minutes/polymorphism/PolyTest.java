package com.in28minutes.polymorphism;

public class PolyTest {

	public static void main(String[] args) {
		 Animal a =  new Animal();
		 a.shout(); // don't know
		 
		 Animal d =  new Dog();
		 d.shout(); // bow bow
//		 d.run(); // can't call DOG's run method as we referencing Animal class
//		 refernce to call DOG object, you can only calll animal's methods

		 Animal c =  new Cat();
		 c.shout(); // mew mew
		 
		 
		 Dog dog = new Dog();
		 dog.shout();  // bow bow
		 dog.run();  // can run
	}

}
