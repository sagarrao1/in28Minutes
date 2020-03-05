package com.in28Minutes.spring.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28Minutes.spring.aop.springaop.busines.Business1;
import com.in28Minutes.spring.aop.springaop.busines.Business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{

////    Regular way of calling classes
//	private static Logger logger =  LoggerFactory.getLogger(SpringAopApplication.class);
//	
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = SpringApplication.run(SpringAopApplication.class, args);
//		
//		Business1 business1 = applicationContext.getBean(Business1.class);
//		Business2 business2 = applicationContext.getBean(Business2.class);		
//		logger.info(business1.calculateSomething());
//		logger.info(business2.calculateSomething());		
//	}

	
//	This new implements CommandLineRunner interface which we need to implement run() method
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;		

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringAopApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());				
	}
	
	
}
