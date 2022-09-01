package com.revature.thursday.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.revature.thursday.model.Bird;

/*
 * There are two reflective ways to creating an instance of classes
 * 
 * A reason why this is useful, is some classes have more internal information
 * after they have been instantiated
 */

public class ClassInstance {
	
	/*
	 * First lets use the bird class and confirm that it has constructors
	 */
	
	public static void getAllConstructors() {
		try {
			Class<?> birdClass = Class.forName("com.revature.thursday.model.Bird");
			
			Constructor<?>[] constructors = birdClass.getConstructors();
			
			for (Constructor constructor : constructors) {
				System.out.println(constructor);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void getSpecificConstructor() {
		try {
			Class<?> birdClass = Class.forName("com.revature.thursday.model.Bird");
			
			Constructor<?> cons1 = birdClass.getConstructor();
			Constructor<?> cons2 = birdClass.getConstructor(String.class);
			
			Constructor<?> cons3 = birdClass.getConstructor(String.class, boolean.class);
			
			System.out.println(cons1);
			System.out.println(cons2);
			System.out.println(cons3);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Instantiation during runtime
	
	public void givenClassInstantiateObjectRuntime() {
		/*
		 * We instantiate an object by calling the newInstance method of Constructor class
		 * and passing the required parameters in the declared order
		 * 
		 * We then cast the result to the required type
		 * 
		 */
		
		try {
			Class<?> birdClass = Class.forName("com.revature.thursday.model.Bird");
			Constructor<?> cons1 = birdClass.getConstructor();
			Constructor<?> cons2 = birdClass.getConstructor(String.class);
			
			Constructor<?> cons3 = birdClass.getConstructor(String.class, boolean.class);
			
			Bird bird1 = (Bird) cons1.newInstance();
			Bird bird2 = (Bird) cons2.newInstance("Pigeon");
			Bird bird3 = (Bird) cons3.newInstance("Seagull", true);
			
			System.out.println(bird1);
			System.out.println(bird2);
			System.out.println(bird3);
			
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		getAllConstructors();
		getSpecificConstructor();
		ClassInstance ci = new ClassInstance();
		ci.givenClassInstantiateObjectRuntime();
	}

}
