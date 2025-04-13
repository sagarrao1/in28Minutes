package com.in28minutes.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorlSpring {

	public static void main(String[] args) {		
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		
		System.out.println(context.getBean("person"));
//		System.out.println(context.getBean(Person.class));
	
		
		System.out.println(context.getBean("address2"));
//		System.out.println(context.getBean(Address.class)+" : "+" Address class  ");
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
		System.out.println();
		
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		Arrays.stream(beanDefinitionNames).forEach(n -> System.out.println(n));		
		
		System.out.println(context.getBean("person5Qualifier"));
		
		}
		
	}

}
