package com.javatechie.soap.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.javatechie.soap.loan_eligibility.AcknowledgementResponse;
import com.javatechie.soap.loan_eligibility.CustomerRequest;

@Service
public class SoapClient {
	
	@Autowired
	private Jaxb2Marshaller marshaller;
		
	private WebServiceTemplate template;
	
	public AcknowledgementResponse getLoanStatus(CustomerRequest request) {
		template = new WebServiceTemplate(marshaller);
		AcknowledgementResponse response = (AcknowledgementResponse) 
				template.marshalSendAndReceive("http://localhost:8080/ws", request);
		
		return response;
	}
	

}
