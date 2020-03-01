package com.in28minutes.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalService {
	
	@Value("${exertnal.value.service}")
	String url;

	public String getServiceValue() {
		return url;
	}
}
