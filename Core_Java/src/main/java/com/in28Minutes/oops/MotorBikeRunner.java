package com.in28Minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike tvs = new MotorBike(40);
		MotorBike yamaha = new MotorBike(100);

		MotorBike suzuki = new MotorBike();

		System.out.println("tvs speed :" + tvs.getSpeed());
		System.out.println("Yamaha speed :" + yamaha.getSpeed());
		System.out.println("suzuki speed :" + suzuki.getSpeed());

		tvs.start();
		yamaha.start();

//		tvs.setSpeed(40);
//		yamaha.setSpeed(100);

		tvs.increaseSpeed(100);
		yamaha.increaseSpeed(100);

		System.out.println("tvs speed :" + tvs.getSpeed());
		System.out.println("Yamaha speed :" + yamaha.getSpeed());

		tvs.decreaseSpeed(50);
		yamaha.decreaseSpeed(250);

//		int tvsSpeed = tvs.getSpeed(); // get the tvs speed
//		tvsSpeed += 100;// increase the speed of tvs
//		tvs.setSpeed(tvsSpeed);// set it to tvs
//
//		int yamahaSpeed = yamaha.getSpeed(); // get the yamaha speed
//		yamahaSpeed += 100;// increase the speed of yamaha
//		yamaha.setSpeed(yamahaSpeed);// set it to yamaha

		System.out.println("tvs speed :" + tvs.getSpeed());
		System.out.println("Yamaha speed :" + yamaha.getSpeed());

	}

}
