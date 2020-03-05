package com.in28Minutes.spring.aop.springaop.busines;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28Minutes.spring.aop.springaop.data.Dao1;

@Service
public class Business1 {
	
	@Autowired
	Dao1 dao1;
	
	public String calculateSomething() {
		return dao1.retriveSomething();
	}

}
