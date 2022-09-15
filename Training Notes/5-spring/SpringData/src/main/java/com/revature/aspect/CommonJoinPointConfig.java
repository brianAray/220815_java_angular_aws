package com.revature.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class CommonJoinPointConfig {

	@Pointcut("execution(* com.revature.service.*.*(..))")
	public void serviceLayerExecution() {}
	
	// Now we just pass the qualified name of the method as the point cut to specific aspects
	
	@Pointcut("execution(* com.revature.repository.*.*(..))")
	public void repositoryLayerExecution() {}
}
