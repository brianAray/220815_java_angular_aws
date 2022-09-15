package com.revature.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(
			value="com.revature.aspect.CommonJoinPointConfig.serviceLayerExecution() ||"
					+ " com.revature.aspect.CommonJoinPointConfig.repositoryLayerExecution()",
			returning = "result"
			)
	public void afterReturningAdvice(JoinPoint jp, Object result) {
		logger.info("{} returned with value {}", jp, result);
	}
	
	
	// WE use after typically to check a return value or to check if an exception has been thrown by
	// a method
	@AfterThrowing(
			value="com.revature.aspect.CommonJoinPointConfig.serviceLayerExecution()",
			throwing="error"
			)
	public void afterThrowingAdvice(JoinPoint jp, Throwable error) {
		logger.info("{} throws the exception {}", jp, error);
	}
	
	@After(value="com.revature.aspect.CommonJoinPointConfig.serviceLayerExecution()")
	public void afterAdvice(JoinPoint jp) {
		logger.info("after execution of {}", jp);
	}
}
