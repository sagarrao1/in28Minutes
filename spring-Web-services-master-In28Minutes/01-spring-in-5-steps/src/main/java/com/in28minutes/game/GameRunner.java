package com.in28minutes.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.game.model.GamingConsole;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	}
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	
}
