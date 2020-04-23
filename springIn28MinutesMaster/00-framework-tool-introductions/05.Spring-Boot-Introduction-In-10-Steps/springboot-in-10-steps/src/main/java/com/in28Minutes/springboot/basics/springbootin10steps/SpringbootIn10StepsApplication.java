package com.in28Minutes.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		
		System.out.println("Printing beanDefinitionNames ============");
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}

		System.out.println("ending  beanDefinitionNames ============");
			
	}

}
