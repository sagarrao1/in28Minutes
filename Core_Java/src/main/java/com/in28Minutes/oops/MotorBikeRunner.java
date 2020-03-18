package com.in28Minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike tvs = new MotorBike();
		MotorBike yamaha = new MotorBike();

		tvs.start();
		yamaha.start();

		tvs.setSpeed(40);
//		System.out.println(tvs.getSpeed());

		yamaha.setSpeed(100);
//		System.out.println(yamaha.getSpeed());

	}

}
