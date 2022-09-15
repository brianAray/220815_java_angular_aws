package com.revature.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.revature.repository.entity.Customer;

@Aspect
@Component
public class ValidationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Pointcut("execution(* com.revature.controller.HomeController.*(..))")
	private void controllerPointcut() {}
	
	@Around("controllerPointcut() and args(customer)")
	public void aroundAdvice(ProceedingJoinPoint pjp, Customer customer) throws Throwable {
		logger.info("{} is being validated at {}", customer, pjp);
		Boolean check = CustomerValidation.validateCustomer(customer);
		if(check) {
			logger.info("{} is valid", customer);
			pjp.proceed(pjp.getArgs());
		}else {
			logger.info("{} is invalid", customer);
		}
	}
}


class CustomerValidation{
	
	public static boolean validateCustomer(Customer customer) {
		return !(customer.getFirstname().length() <= 1 || customer.getLastname().length() <= 1);
	}
}
