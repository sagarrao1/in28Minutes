package com.in28Minutes.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Aspect = combination of advice and point cut
//Configuration
@Aspect
@Configuration
public class UserAcessAspect {
  
	private Logger logger= LoggerFactory.getLogger(this.getClass());
	
//	What kind of method calls you want to intercept?
//	execution(* PACKAGE.*.*(..))
//	Point cut
//	@Before("execution(* com.in28Minutes.spring.aop.springaop..*.*(..))")
	@Before("execution(* com.in28Minutes.spring.aop.springaop.dummy.*.*(..))")
	public void before(JoinPoint joinpoint) {
//		Advice
//		What to do when you intercept ?
		logger.info(" Check for user access ");
		logger.info("Allowed execution for -> {} ", joinpoint);
	}
}
