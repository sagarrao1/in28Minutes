package com.in28Minutes.spring.aop.springaop.busines;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28Minutes.spring.aop.springaop.data.Dao2;

@Service
public class Business2 {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Dao2 dao2;
	
	public String calculateSomething() {
		//Business Logic
		String value = dao2.retriveSomething();
		logger.info("In Business 2 - {}", value);
		return value;

	}

}
