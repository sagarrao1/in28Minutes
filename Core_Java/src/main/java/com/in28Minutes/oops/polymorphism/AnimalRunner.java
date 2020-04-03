package com.in28Minutes.oops.polymorphism;

import com.in28Minutes.oops.interfaceVsAbstract.Animal;
import com.in28Minutes.oops.interfaceVsAbstract.Cat;
import com.in28Minutes.oops.interfaceVsAbstract.Dog;

public class AnimalRunner {
//	Polymorphism is with abstract classes like below
//	Polymorphism : is defined as same code with different behaviour
//	we are executing same code with different behaviour from different classes
//	this is called polymorphism 
//	polymorphism applies to interfaces as well as abstract classes

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };

		for (Animal animal : animals) {
			System.out.print(animal.getClass().getSimpleName() + " : ");
			animal.bark();
		}
	}

}
