package com.in28Minutes.oops.level2;

//3 things we need to consider in creating object
//1. state of Object(what are Member variables you need)
//2. Cosnstructors ( how you want to create object)
//3. Behaviour ( what are methods customer need)

public class Fan {

	// state
	private String make;
	private String color;
	private double radius;
	private Boolean isOn;
	private byte speed; // 1 to 5

	// constructor
	public Fan(String make, String color, double radius) {
		this.make = make;
		this.color = color;
		this.radius = radius;
	}

	// methods
	public void swicthOn() {
		this.isOn = true;
		setSpeed((byte) 1);
	}

	public void swicthOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		if (isOn == false && !(speed == 0)) {
			System.out.println("Switch on the fan first !!!");
		} else {
			this.speed = speed;
		}

	}

	@Override
	public String toString() {
		return String.format("make - %s , color-%s, radius -%f, isOn - %b, speed - %d", make, color, radius, isOn,
				speed);
	}

}
