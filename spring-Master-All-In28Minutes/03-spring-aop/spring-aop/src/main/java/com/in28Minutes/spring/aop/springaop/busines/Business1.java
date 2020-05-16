package com.in28Minutes.spring.aop.springaop.busines;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28Minutes.spring.aop.springaop.data.Dao1;

@Service
public class Business1 {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Dao1 dao1;
	
	public String calculateSomething() {
		
		//Business Logic
		String value = dao1.retriveSomething();
		
		// below sleep is to test aournd point cut of aspect in aop
		try {
			Thread.sleep(54);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("In Business 1- {}", value);
		return value;
	}

}
