package com.in28Minutes.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	
	public String retriveSomething() {
		return "Dao1";
	}

}
