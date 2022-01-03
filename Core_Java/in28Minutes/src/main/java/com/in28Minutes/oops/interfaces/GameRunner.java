package com.in28Minutes.oops.interfaces;

public class GameRunner {

//	with interface we can have multiple implementations like below
//	we can refer with interface to create concrete class Object
//	with same code we are calling different Objects like Chess and Mario
//	this is called polymorphism

	public static void main(String[] args) {
		// MarioGame game = new MarioGame();
//		ChessGame game = new ChessGame();

//		GamingConsole game = new MarioGame();
		ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
