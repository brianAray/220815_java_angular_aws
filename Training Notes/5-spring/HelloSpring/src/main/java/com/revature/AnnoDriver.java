package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature")
public class AnnoDriver {
	
	private static ApplicationContext context;
	
	@Bean
	public ExampleBean exampleBean() {
		return new ExampleBean();
	}
	
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AnnoDriver.class);
		
		for(String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
		
	}

}
