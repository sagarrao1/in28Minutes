package com.in28Minutes.oops.interfaceVsAbstract;

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new AeroPlane() };

		for (Flyable flyable : flyingObjects) {
			System.out.print(flyable.getClass().getSimpleName() + " : ");
			flyable.fly();
		}

		System.out.println("===================");

		Animal[] animals = { new Dog(), new Cat() };

		for (Animal animal : animals) {
			System.out.print(animal.getClass().getSimpleName() + " : ");
			animal.bark();
		}
	}

}
