package com.in28Minutes.oops;

public class MotorBike {
//	state
	private int speed;

// behaviour
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void start() {
		System.out.println("Starting ...");
	}

}
