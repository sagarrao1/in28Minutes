package com.in28minutes.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(GameConfiguration.class)) {
		
//			GamingConsole game = context.getBean(MarioGame.class);			
//			GamingConsole game = context.getBean(AgeOfAmpaire.class);			
//			GamingConsole game = context.getBean(PackMan.class);
			
//			GameRunner gameRunner = context.getBean(GameRunner.class);
//			gameRunner.run();
			
			context.getBean(GameRunner.class).run();

		}
		

	}

}
