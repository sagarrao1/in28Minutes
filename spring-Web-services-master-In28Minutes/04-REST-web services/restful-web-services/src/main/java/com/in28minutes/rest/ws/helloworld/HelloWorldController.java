package com.in28minutes.rest.ws.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.ws.helloworld.HelloWorldBean;

//controller
@RestController
public class HelloWorldController{
	
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

	
}
