package com.in28minutes.game.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AgeOfAmpaire implements GamingConsole{
	
	public void up() {
		System.out.println("AgeOfAmpaire up");
	}

	public void down() {
		System.out.println("AgeOfAmpaire down");
	}
	
	public void left() {
		System.out.println("AgeOfAmpaire left");
	}
	
	public void right() {
		System.out.println("AgeOfAmpaire right");
	}
}
