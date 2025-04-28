package com.javatechie.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.soap.client.SoapClient;
import com.javatechie.soap.loan_eligibility.AcknowledgementResponse;
import com.javatechie.soap.loan_eligibility.CustomerRequest;

@SpringBootApplication
@RestController
public class SpringBootSoapWSApplication {
	
	@Autowired
	private SoapClient client;

	@PostMapping("/getLoanStatus")
	public AcknowledgementResponse invokeSoapClientLoanStatus(@RequestBody CustomerRequest request) {		
		return client.getLoanStatus(request);		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWSApplication.class, args);
	}
}
