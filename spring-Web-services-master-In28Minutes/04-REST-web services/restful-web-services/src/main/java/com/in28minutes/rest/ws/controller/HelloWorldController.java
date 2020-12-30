package com.in28minutes.rest.ws.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.ws.helloworld.HelloWorldBean;

//controller
@RestController
public class HelloWorldController{
	
	
	@Autowired
	MessageSource messageSource;
	
	//GET
	// URI - /hello-world
	//method returns "Hello World!!"
	//return simple string back	
	@GetMapping(path = {"/","/hello-world"})
	public String helloWorld() {
		return "Hello World!! !";
	}
	
//	return hello world bean back
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World bean ");
	}

//	take value from pathVariable bean back
	@GetMapping(path = "hello-world/{name}")
	public HelloWorldBean hellowWorldBeanDisplay(@PathVariable("name")  String name) {		
		return new HelloWorldBean(name);
	}

	
//	return hello world internationalized
//	@GetMapping(path = "/hello-world-internationalized")
//	public String helloWorldInternationlaized(@RequestHeader(name = "Accept-Language", required = false)Locale locale) {
//		return messageSource.getMessage("good.morning.message", null, locale);
//	}

	
//	Different way than above one. we can user local context header instead of @requestHeader for each method
//	return hello world internationalized
	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationlaized() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}

}
