package com.revature.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.repository.entity.Customer;

@Aspect
@Component
public class CustomerServiceAspect {

	/*
	 * 
	 * Aspects:
	 * A class that implements concerns that cut across multiple classes
	 * These are normal classes configured either through xml, or using the @Aspect annotation
	 * 
	 * Join Point:
	 * Specific points in the application such as method execution, exception handling, changing
	 * object variables, etc.
	 * Spring AOP has join point associated with a method being executed always
	 * 
	 * Advice:
	 * Advices are actions taken for a particular join point
	 * These are methods that get executed when a certain join point with matching point cuts are reached
	 * in the application
	 * 
	 * Pointcut:
	 * Expressions that are matched with join points to determine whether advice needs to be executed or
	 * not. Point cut uses different kinds of expressions that are matched with the join points, the Spring
	 * framework uses the AspectJ point cut expression language
	 * 
	 * Target Object:
	 * They are the object on which advices are applied.
	 * AOP uses runtime proxies so the object is always a proxied object.
	 * This means that a subclass is created at runtime where the target method is overriden and advice
	 * is included based on the configuration
	 * 
	 * AOP Proxy:
	 * Spring AOP usies the JDK Dynamic Proxy to create the Proxy classes with target classes and advice
	 * invocation, these are the AOP classes.
	 * 
	 * Weaving:
	 * The process of linking aspects with other objects to create the advised proxy objects
	 * This can be done at compile, load, or runtime.
	 * Spring AOP performs weaving at runtime.
	 * 
	 * 
	 */
	
	
	/*
	 * Before Advice:
	 * These advices are run before the execution of join point methods
	 * WE can use @Before to mark the advice as a before advice
	 */
	
//	@Before(value = "execution(* com.revature.service.CustomerService.*(..)) and args(customer)")
//	public void beforeAdvice(JoinPoint joinPoint, Customer customer) {
//		System.out.println("Before Method: " + joinPoint.getSignature());
//		System.out.println("Creating Customer with object: " + customer);
//	}
	
	/*
	 * After (finally) Advice:
	 * Advice that gets executed after the join point method finishes executing
	 * This just uses @After
	 * 
	 * After Returning Advice:
	 * If you want an advice for methods that only execute if the join point executes normally
	 * @AfterReturning
	 * 
	 * After Throwing Advice:
	 * Executes only when join point throws exception, you could use for rolling back a transaction
	 * @AfterThrowing
	 * 
	 * Around Advice:
	 * The most important and powerful advice. This surrounds the join point method and we can
	 * also choose whether to execute the join point method or not.
	 * 
	 * You can write advice code that gets executed before and after the execution of the join point
	 * It is the responsibility of the Around advice to invoke the join point method and return values
	 * if the method is returning something
	 * @Around
	 */
	
//	@After(value = "execution(* com.revature.service.CustomerService.*(..)) and args(customer)")
//	public void afterAdvice(JoinPoint joinPoint, Customer customer) {
//		System.out.println("After Method: " + joinPoint.getSignature());
//		
//	}
//	
//	@AfterReturning(pointcut = "execution(* com.revature.service.CustomerService.*(..))", returning="retVal")
//	public void afterReturningAdvice(JoinPoint joinPoint, Object retVal) {
//		System.out.println("After returning Method: " + joinPoint.getSignature());
//		System.out.println("Successfully returning customer: " + retVal.toString());
//	}
	
	
	
}













