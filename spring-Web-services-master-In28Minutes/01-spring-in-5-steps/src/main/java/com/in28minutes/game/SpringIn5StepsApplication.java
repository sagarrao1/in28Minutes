package com.in28minutes.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		ApplicationContext context = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();		
	}
}