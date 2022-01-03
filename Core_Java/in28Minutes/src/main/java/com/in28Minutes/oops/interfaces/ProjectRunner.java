package com.in28Minutes.oops.interfaces;

public class ProjectRunner {

	public static void main(String[] args) {
//		ComplexAlgorithm algorithm = new DummyAlgorithm();
		ComplexAlgorithm algorithm = new RealAlgorithm();

		System.out.println(algorithm.complexAlgorithm(10, 20));
	}

}
