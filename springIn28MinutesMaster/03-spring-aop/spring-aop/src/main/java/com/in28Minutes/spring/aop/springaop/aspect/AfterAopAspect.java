package com.in28Minutes.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Aspect = combination of advice and point cut
//Configuration
//@Aspect
//@Configuration
public class AfterAopAspect {
  
	private Logger logger= LoggerFactory.getLogger(this.getClass());
	
//	What kind of method calls you want to intercept?
//	execution(* PACKAGE.*.*(..))
//	Point cut
	@AfterReturning(value="execution(* com.in28Minutes.spring.aop.springaop.busines.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinpoint, Object result) {
//		Advice
//		What to do when you intercept ?
		logger.info("After execution  of {} return value is: {} ", joinpoint, result);
	}

	@AfterThrowing(value="execution(* com.in28Minutes.spring.aop.springaop.busines.*.*(..))",throwing = "exception")
	public void afterThrowing(JoinPoint joinpoint, Exception exception) {
		logger.info("After execution  of {} return value is: {} ", joinpoint, exception);
	}

	@After(value="execution(* com.in28Minutes.spring.aop.springaop.busines.*.*(..))")
	public void after(JoinPoint joinpoint) {
		logger.info("After plain  of {} return value is: ", joinpoint);
	}

}
