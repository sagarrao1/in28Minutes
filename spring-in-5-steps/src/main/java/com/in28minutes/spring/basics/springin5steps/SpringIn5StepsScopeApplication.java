package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER=LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = 
					new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);				
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);		
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
//		System.out.println(personDAO);
//		System.out.println(personDAO2);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
		
		applicationContext.close();
		
		
	}

}
