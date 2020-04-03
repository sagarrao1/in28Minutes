package com.in28Minutes.oops.polymorphism;

import com.in28Minutes.oops.interfaceVsAbstract.AeroPlane;
import com.in28Minutes.oops.interfaceVsAbstract.Animal;
import com.in28Minutes.oops.interfaceVsAbstract.Bird;
import com.in28Minutes.oops.interfaceVsAbstract.Cat;
import com.in28Minutes.oops.interfaceVsAbstract.Dog;
import com.in28Minutes.oops.interfaceVsAbstract.Flyable;

public class FlyableRunner {

//	Polymorphism : is defined as same code with different behaviour
//	we are executing same code with different behaviour from different classes
//	this is called polymorphism 
//	polymorphism applies to interfaces as well as abstract classes


	public static void main(String[] args) {

//		Polymorphism is with interfaces like below
		Flyable[] flyingObjects = { new Bird(), new AeroPlane() };

		for (Flyable flyable : flyingObjects) {
			System.out.print(flyable.getClass().getSimpleName() + " : ");
			flyable.fly();
		}

		System.out.println("===================");

//		Polymorphism is with abstract classes like below
		Animal[] animals = { new Dog(), new Cat() };

		for (Animal animal : animals) {
			System.out.print(animal.getClass().getSimpleName() + " : ");
			animal.bark();
		}
	}

}
