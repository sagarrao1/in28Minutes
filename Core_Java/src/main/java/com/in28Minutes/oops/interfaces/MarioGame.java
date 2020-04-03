package com.in28Minutes.oops.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump up");

	}

	@Override
	public void down() {
		System.out.println("Jump down");

	}

	@Override
	public void left() {
		System.out.println("Jump left");

	}

	@Override
	public void right() {
		System.out.println("Jump right");

	}

}
