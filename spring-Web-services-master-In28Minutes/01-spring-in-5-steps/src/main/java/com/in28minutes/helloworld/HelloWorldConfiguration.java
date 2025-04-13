package com.in28minutes.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {}; 

record Address (String name, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Sagar";
	}
	
	@Bean
	public int age() {
		return 44;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 32, new Address("qwerty","london"));
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("Narayapur", "Karimnagar");
	}	
	
	@Bean(name = "address3")
//	@Primary
	public Address address3() {
		return new Address("Bank street", "PDPL");
	}
	
	@Bean(name = "address5")
	@Qualifier("address5Qualifier")
	public Address address5() {
		return new Address("Bank street", "HYD");
	}
	
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean	
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean	
	public Person person5Qualifier(String name, int age, 	@Qualifier("address5Qualifier")Address address3) {
		return new Person(name, age, address3);
	}
}
