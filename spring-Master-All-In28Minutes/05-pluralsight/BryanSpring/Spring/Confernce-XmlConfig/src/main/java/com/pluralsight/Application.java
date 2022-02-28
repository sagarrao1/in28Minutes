package com.pluralsight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.SpeakerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
		System.out.println(speakerService.findAll().get(0).getFirstName());
		
//		SpeakerService service = new SpeakerServiceImpl();		
//		System.out.println(service.findAll().get(0).getFirstName());
	}

}
