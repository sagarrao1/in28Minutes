package com.in28minutes.game.model;

import org.springframework.stereotype.Component;

@Component
public class PackMan implements GamingConsole{
	
	public void up() {
		System.out.println("PackMan up");
	}

	public void down() {
		System.out.println("PackMan down");
	}
	
	public void left() {
		System.out.println("PackMan left");
	}
	
	public void right() {
		System.out.println("PackMan right");
	}
}
