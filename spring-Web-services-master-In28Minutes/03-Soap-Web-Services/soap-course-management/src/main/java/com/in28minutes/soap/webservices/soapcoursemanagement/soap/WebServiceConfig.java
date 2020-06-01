package com.in28minutes.soap.webservices.soapcoursemanagement.soap;
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


//Enable Spring Web service
@EnableWs
//Spring configuration
@Configuration
public class WebServiceConfig {
	// MessageDispatcherServelet
	//Application Context
	// url -> /ws/*
	
	@Bean
	public ServletRegistrationBean messageDispatcherServelet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		
		return new ServletRegistrationBean(messageDispatcherServlet ,"/ws/*");
	}
	
	// we want spring to generate wsdl
	// /ws/courses.wsdl , to create it needs
	// xsd  -> 		course-details.xsd
	// port type -> CoursePort
	// name space ->  http://in28minutes.com/courses
	
	@Bean(name="courses")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema coursesSchema) {		
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setLocationUri("/ws");
		definition.setPortTypeName("CoursePort");
		definition.setTargetNamespace("http://in28minutes.com/courses");
		definition.setSchema(coursesSchema);
		// /ws/
		// xsd  -> 		course-details.xsd
		// port type -> CoursePort
		// name space ->  http://in28minutes.com/courses		
		return definition;
	}
	
	
	@Bean
	public XsdSchema coursesSchema() {		
		return new SimpleXsdSchema ( new ClassPathResource("course-details.xsd"));
	}
}
