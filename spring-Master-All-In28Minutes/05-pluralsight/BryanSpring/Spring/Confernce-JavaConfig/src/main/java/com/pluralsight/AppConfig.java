package com.pluralsight;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.util.CalendarFactory;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

	@Bean(name = "cal")
	public CalendarFactory calFactory() {
		CalendarFactory factory= new CalendarFactory();	
		factory.addDays(2);
		return factory;		
	}
	
	
	@Bean 
	public Calendar cal() throws Exception {
		return calFactory().getObject();
	}
	
//	@Bean(name = "speakerRepository")
//	public SpeakerRepository getSpeakerRepositiry() {
//		return new HibernateSpeakerRepositoryImpl();
//	}
//	
//	
//	@Bean(name = "speakerService")
////	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//	public SpeakerService getSpeakerService() {
//		
////		SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepositiry());
//		
//		SpeakerServiceImpl service = new SpeakerServiceImpl();
//		
////		SpeakerServiceImpl service = new SpeakerServiceImpl();
////		service.setRespository(getSpeakerRepositiry());	
//		
//		return service;
//	}
	
	
}

