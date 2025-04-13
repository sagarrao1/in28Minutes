package com.in28minutes.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.game.model.GamingConsole;
import com.in28minutes.game.model.PackMan;

//@Configuration
public class GameConfiguration {
	
//	@Bean
//	public PackMan packMan() {
//		return new PackMan();
//	}	
//
//	@Bean
//	public AgeOfAmpaire ageOfAmpaire() {
//		return new AgeOfAmpaire();
//	}
//	
//	@Bean
//	public MarioGame  marioGame() {
//		return new MarioGame();
//	}

	@Bean
	public GamingConsole game() {
		GamingConsole game = new PackMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
		
	}
	
}
