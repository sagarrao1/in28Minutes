package com.in28minutes.game;

import com.in28minutes.game.model.GamingConsole;
import com.in28minutes.game.model.PackMan;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		GamingConsole game = new MarioGame();			
//		GamingConsole game = new AgeOfAmpaire();
		
		GamingConsole game = new PackMan();
		
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
		
		

	}

}
