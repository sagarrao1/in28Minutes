package com.in28Minutes.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.in28Minutes.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retriveSomething() {
		return "Dao1";
	}

}
