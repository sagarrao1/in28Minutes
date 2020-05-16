package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;


@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER=LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);				
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);		
		ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);
		
//		System.out.println(componentDAO);
//		System.out.println(componentDAO.getJdbcConnection());
//		System.out.println(componentDAO.getJdbcConnection());
//		System.out.println(componentDAO2);
//		System.out.println(componentDAO2.getJdbcConnection());
		
		LOGGER.info("{}",componentDAO);
		LOGGER.info("{}",componentDAO.getJdbcConnection());
		LOGGER.info("{}",componentDAO.getJdbcConnection());
		
		LOGGER.info("{}",componentDAO2);
		LOGGER.info("{}",componentDAO2.getJdbcConnection());
		
		
	}

}
