package com.pluralsight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.SpeakerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	
		SpeakerService speakerService = appContext.getBean("speakerService", SpeakerService.class);
		System.out.println(speakerService.findAll().get(0).getFirstName());
		System.out.println(speakerService);
		
		SpeakerService speakerService1 = appContext.getBean("speakerService", SpeakerService.class);
		System.out.println(speakerService1);
		
		
		
//		without spring 
		
//		SpeakerService service = new SpeakerServiceImpl();		
//		System.out.println(service.findAll().get(0).getFirstName());
		
	}

}
