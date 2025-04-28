package com.javatechie.soap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWSConfig {
	
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServelet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		
		return new ServletRegistrationBean<MessageDispatcherServlet>(messageDispatcherServlet ,"/ws/*");
	} 

	
	// we want spring to generate wsdl
		// /ws/courses.wsdl , to create it needs
		// xsd  -> 		course-details.xsd
		// port type -> CoursePort
		// name space ->  http://in28minutes.com/courses
		
		// mapping XSD so that Spring can generate wsdl for us at /ws/courses.wsdl
		
		@Bean(name = "loanEligibility")
		public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema loanEgSchema) {		
			DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
			definition.setLocationUri("/ws");
			definition.setPortTypeName("LoanEligibilityIndicator");
			definition.setTargetNamespace("http://www.javatechie.com/soap/loan-eligibility");
			definition.setSchema(loanEgSchema);
			// /ws/
			// xsd  -> 		course-details.xsd
			// port type -> CoursePort
			// name space ->  http://in28minutes.com/courses		
			return definition;
		}
		
		
		// mapping XSD in spring ws
//		it will read course-details.xsd from src/main/resources
		@Bean
		public XsdSchema loanEgSchema() {		
			return new SimpleXsdSchema ( new ClassPathResource("loan-eligibility.xsd"));
		}
	
	
}
