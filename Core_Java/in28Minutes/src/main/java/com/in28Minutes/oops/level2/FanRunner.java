package com.in28Minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan1 = new Fan("Crompton", "black", 7.50);

		System.out.println("first    :" + fan1);

		fan1.swicthOn();
		System.out.println("Switch on:" + fan1);

		fan1.swicthOff();
		System.out.println("SwitchOff:" + fan1);

		fan1.setSpeed((byte) 3); // speed can 1.. 5
		System.out.println("set Speed:" + fan1);

		fan1.swicthOn();
		System.out.println("Switch on:" + fan1);

		fan1.setSpeed((byte) 5); // speed can 1.. 5
		System.out.println("set Speed:" + fan1);

	}

}
