package com.in28minutes.example.spring.business.examples.xmlcontext;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.in28minutes.example.spring.business.examples.HiService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/TestContext.xml"})
public class DependencyInjectionExamples {

	@Autowired
	@Qualifier(value = "goodNightServiceImpl1")
	HiService1 service;
	
	@Test
	public void dummyTest() {
		System.out.println(service.sayHi());
	}

}

@Component
//@Primary
class GoodMorningServiceImpl1 implements HiService1{
	public String sayHi() {
		return "Good Morning";		
	}
}

@Component
class GoodNightServiceImpl1 implements HiService1{
	public String sayHi() {
		return "Good night";		
	}
}

