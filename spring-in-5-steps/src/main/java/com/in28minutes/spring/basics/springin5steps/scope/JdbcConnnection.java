package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnnection {
	
	public JdbcConnnection(){
		System.out.println(" construtor of jdbc connection");
	}

}
