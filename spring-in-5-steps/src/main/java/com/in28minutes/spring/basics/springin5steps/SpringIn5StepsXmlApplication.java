package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
	   
public class SpringIn5StepsXmlApplication {
	
	private static Logger LOGGER=LoggerFactory.getLogger(SpringIn5StepsXmlApplication.class);

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("appplicationContext.xml")){
		
//		AnnotationConfigApplicationContext applicationContext =				
//				new AnnotationConfigApplicationContext(SpringIn5StepsXmlApplication.class);

			
			LOGGER.info("Beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			LOGGER.info("beans count -> {}",applicationContext.getBeanDefinitionCount());
			
		XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);		
		LOGGER.info("info {}", xmlPersonDAO );
		LOGGER.info("info 2{}", xmlPersonDAO.getXmlJdbcConnection());
		}
	}

	
}
