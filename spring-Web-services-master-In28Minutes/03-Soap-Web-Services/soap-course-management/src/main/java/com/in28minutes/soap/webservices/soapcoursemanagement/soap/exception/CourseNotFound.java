package com.in28minutes.soap.webservices.soapcoursemanagement.soap.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CLIENT)
public class CourseNotFound extends RuntimeException {
	private static final long serialVersionUID = 8969773816248509445L;

	public CourseNotFound(String message) {
		super(message);
	}
}
