package com.revature.thursday.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

import com.revature.thursday.model.Adult;

/*
 * There are a few ways we can use the Reflection API
 * 
 * In this case, we will use Reflection to analyze all the methods
 * of a class by passing the Class name (like Adult.class) as a parameter
 */

public class ClassInspector {
	
	public static void main(String[] args) {
		inspectClass(Adult.class);
	}
	
	
	
	public static void inspectClass(Class<?> clazz) {
		listPublicConstructors(clazz);
		listNonPublicConstructors(clazz);
		listPublicFields(clazz);
		listNonPublicFields(clazz);
		listPublicMethods(clazz);
		listNonPublicMethods(clazz);
	}



	public static void listPublicConstructors(Class<?> clazz) {
		System.out.println("Printing the public constructors of the " + clazz.getName());
		Constructor<?>[] constructors = clazz.getConstructors();
		
		for(Constructor<?> constructor : constructors) {
			System.out.println("\tConstructor name: " + constructor.getName());
			System.out.println("\tConstructor param types: " + Arrays.toString(constructor.getParameterTypes()) + "\n");
			System.out.println();
		}
	} 
	
	public static void listNonPublicConstructors(Class<?> clazz) {
		System.out.println("Printing non-visible constructors of the " + clazz.getName());
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		
		for(Constructor<?> constructor : constructors) {
			
			// Parse out the public constructors
			if ((constructor.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC) continue;

			
			System.out.println("\tConstructor name: " + constructor.getName());
			System.out.println("\tConstructor param types: " + Arrays.toString(constructor.getParameterTypes()) + "\n");
			System.out.println();
		}
	}
	
	
	public static void listNonPublicFields(Class<?> clazz) {
		System.out.println("Printing the non-public fields of the " + clazz.getName());
		Field[] fields = clazz.getDeclaredFields();
		
		if(fields.length == 0) {
			System.out.println("There are no non-public fields in " + clazz.getName());
		}
		
		for(Field field : fields) {
			
			if ((field.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC) continue;
			
			System.out.println("\tField name: " + field.getName());
			System.out.println("\tField Type: " + field.getType());
			System.out.println("\tIs field primitive? " + field.getType().isPrimitive());
			System.out.println("\tModifiers bit value: " + Integer.toBinaryString(field.getModifiers()) + "\n");
		} 
	}
	
	public static void listPublicFields(Class<?> clazz) {
		System.out.println("Printing the public fields of the " + clazz.getName());
		Field[] fields = clazz.getFields();
		
		if(fields.length == 0) {
			System.out.println("There are no public fields in " + clazz.getName());
		}
		
		for(Field field : fields) {
			System.out.println("\tField name: + " + field.getName());
			System.out.println("\tField Type: + " + field.getType());
			System.out.println("\tIs field primitive? " + field.getType().isPrimitive());
			System.out.println("\tModifiers bit value: " + Integer.toBinaryString(field.getModifiers()) + "\n");
		} 
	}

	public static void listPublicMethods(Class<?> clazz) {
		System.out.println("Printing the public methods of the " + clazz.getName());
		Method[] methods = clazz.getMethods();
		
		if(methods.length == 0) {
			System.out.println("There are no public methods in " + clazz.getName());
		}
		
		for(Method method : methods) {
			// I don't want to include methods from the Object class
			if(method.getDeclaringClass() == Object.class) continue;
			
			System.out.println("\nMethod name: " + method.getName());
			System.out.println("\tMethod param count: " + method.getParameterCount());
			System.out.println("\tMethod declared class: " + method.getDeclaringClass());
			System.out.println("\tMethod declared annotations: " + Arrays.toString(method.getDeclaredAnnotations()));
		
			Parameter[] params = method.getParameters();
			for(Parameter param : params) {
				System.out.println("\t\tParameter name: " + param.getName());
				System.out.println("\t\tParameter type: " + param.getType());
				System.out.println("\t\tParameter annotations: " + Arrays.toString(param.getDeclaredAnnotations()));
			}
			System.out.println();
		}
	} 

	public static void listNonPublicMethods(Class<?> clazz) {
		System.out.println("Printing the public methods of the " + clazz.getName());
		Method[] methods = clazz.getMethods();
		
		if(methods.length == 0) {
			System.out.println("There are no public methods in " + clazz.getName());
		}
		
		for(Method method : methods) {
			
			if((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC) continue;
			// I don't want to include methods from the Object class
			if(method.getDeclaringClass() == Object.class) continue;
			
			System.out.println("\nMethod name: " + method.getName());
			System.out.println("\tMethod param count: " + method.getParameterCount());
			System.out.println("\tMethod declared class: " + method.getDeclaringClass());
			System.out.println("\tMethod declared annotations: " + Arrays.toString(method.getDeclaredAnnotations()));
		
			Parameter[] params = method.getParameters();
			for(Parameter param : params) {
				System.out.println("\t\tParameter name: " + param.getName());
				System.out.println("\t\tParameter type: " + param.getType());
				System.out.println("\t\tParameter annotations: " + Arrays.toString(param.getDeclaredAnnotations()));
			}
			System.out.println();
		}
	}
}
