package com.in28Minutes.spring.aop.springaop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Aspect = combination of advice and point cut
//Configuration
@Aspect
@Configuration
public class MethodExecutionCalculation {
  
	private Logger logger= LoggerFactory.getLogger(this.getClass());	
	
//	@Around("execution(* com.in28Minutes.spring.aop.springaop.busines.*.*(..))")
	
	@Around("@annotation(com.in28Minutes.spring.aop.springaop.aspect.TrackTime)")
	public void around(ProceedingJoinPoint joinpoint) throws Throwable {
//		start time = x
//		proceed method execution
//		end time = y 
//		time  taken
		
		long startTime = System.currentTimeMillis();
		joinpoint.proceed();
		long timeTaken=System.currentTimeMillis()-startTime;		
		logger.info("time  taken for execution of {} is :{} ", joinpoint, timeTaken);
	}
}
