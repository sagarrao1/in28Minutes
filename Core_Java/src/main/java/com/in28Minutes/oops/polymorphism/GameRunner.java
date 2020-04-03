package com.in28Minutes.oops.polymorphism;

import com.in28Minutes.oops.interfaces.ChessGame;
import com.in28Minutes.oops.interfaces.GamingConsole;
import com.in28Minutes.oops.interfaces.MarioGame;

public class GameRunner {
	// Polymorphism : is defined as same code with different behaviour
//	Polymorphism is with interfaces like below

	public static void main(String[] args) {
		GamingConsole[] games=  {new MarioGame(), new ChessGame()};
		
//	we are executing same code with different behaviour from different classes
//	this is called polymorphism 
//		polymorphism applies to interfaces as well as abstract classes

		for (GamingConsole game : games) {
			System.out.println(game.getClass().getSimpleName() + " ======= ");
			game.up();
			game.down();
			game.left();
			game.right();
		}
	}

}
