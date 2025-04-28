package com.javatechie.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javatechie.soap.loan_eligibility.AcknowledgementResponse;
import com.javatechie.soap.loan_eligibility.CustomerRequest;
import com.javatechie.soap.service.LoanEligibilityService;

@Endpoint
public class LoanEligibilityEndPoint {

	public static final String NAMESPACE="http://www.javatechie.com/soap/loan-eligibility";
	
	@Autowired
	private LoanEligibilityService service;
	
	@PayloadRoot(namespace = NAMESPACE,localPart = "CustomerRequest")
	@ResponsePayload
	public AcknowledgementResponse getLoanStatus(@RequestPayload CustomerRequest request) {
		return service.checkLoanEiligibility(request);
	}
}
