package com.revature.thursday.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

import com.revature.thursday.model.Adult;

public class MethodInvoker {
	
	// First we need to get a Method object that we want to invoke
	// The Class object is used to represent the type in which the method is defined
	
	public static void main(String[] args) {
		getMethods(Adult.class);
	}
	
	public static void getMethods(Class<?> clazz) {
		
		Method[] publicMethods = clazz.getMethods();
		Method[] nonPublicMethods = clazz.getDeclaredMethods();
		
		
		try {
			Method introduceMethod = clazz.getMethod("introduce");
			
			Adult adult = new Adult("Mike", 12, "Toronto", "Canada");
			
			introduceMethod.invoke(adult);
			
			/*
			 * By default not all methods are accessible
			 * This means that the JVM enforeced access control checks
			 */
			
			Method privateMethod = clazz.getDeclaredMethod("thisIsJustPrivate");
			
			privateMethod.setAccessible(true);
			
			privateMethod.invoke(adult);
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
