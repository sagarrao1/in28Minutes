package com.in28Minutes.oops;

public class MotorBike {
//	state
	private int speed;

//Constructor
	// default constructor
	public MotorBike() {
		this(5);
		System.out.println("default constructor is called");
		// setting deafullt value
//		this.speed = 5;
//		another way setting value is , it should first statement
	}

	public MotorBike(int speed) {
		super();
		this.speed = speed;
		System.out.println("custom constructor is called");
	}

// behaviour
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		} else {
			System.out.println("Can't set speed less than 0");
		}
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	public void start() {
		System.out.println("Starting ...");
	}

}
