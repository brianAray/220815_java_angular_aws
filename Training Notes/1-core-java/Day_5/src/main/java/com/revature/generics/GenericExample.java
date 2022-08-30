package com.revature.generics;

import java.util.Arrays;
import java.util.List;

public class GenericExample {
	
	/*
	 * Generics means paramteterize types. The idea is to allow multiple different data types within the same
	 * method, class or interface.
	 * 
	 * Using Generics, we can create classes that work with different data types.
	 * 
	 * Why should we use them?
	 * 
	 * - If we don't use them, we lack type safety
	 * 
	 * As all classes as inheriting the Object as the Superclass, and Object reference can refer to any object
	 * , this lead to a type unsafety.
	 * 
	 * 
	 * There are two types of Generics:
	 * 
	 * Generic Methods
	 * 
	 * These are methods that take in a parameter and return some value after performing a task.
	 * It is exactly like a normal function, however, a generic method has type parameters that are cited
	 * by the actual type.
	 * This allows the generic method to be used in a more general way. The compiler takes care of ensuring
	 * type safety which enables developers to code easily as you do not have to perform tedious type casting
	 * 
	 * 
	 * Generic Class
	 * 
	 * A generic class is implemented just like a non-generic class. The only difference is that it contains
	 * a type parameter section. There can be more than one type of parameter, separated by a comma.
	 * 
	 * 
	 * T - Type
	 * E - Element
	 * K - Key
	 * N - Number
	 * V - Value
	 * 
	 * 
	 * Generic Wildcards
	 * 
	 * To use a wildcard symbol, a generic uses '?'. It represents an unknown type.
	 * The wildcard can be used in a variety of situation such as the type parameter of a field, or local
	 * variable; sometimes as a return type.
	 * Unlike arrays, different instantations of a generic type are not compatible with each other, not
	 * even explicitly. This incompatibility is softened using the wildcard
	 * 
	 * 
	 * Types of Wildcards:
	 * 1. Upper Bound
	 * 2. Lower Bound
	 * 3. Unbounded
	 * 
	 * 
	 * Generic Work only with Reference Types:
	 * 
	 * When we decalre an instance of a generic type, the type argument passed to the type parameter
	 * must be of the reference type. We cannot use primitive data types like int, char
	 * 
	 * Test<int> obj = new Test<int>(12);
	 * 
	 * ^ will cause a compilation error
	 * 
	 * Primitive type arrays can be passed into it as arrays are reference types
	 * 
	 * ArrayList<int[]> a = new ArrayList<>();
	 * 
	 * 
	 * Advantages of Generics:
	 * 
	 * 1. Code reusability
	 * 		We can write methods / class / interfaces once that can be used for any type
	 * 
	 * 2. Type Safety
	 * 		Generics make errors appear during compile time rather than run time
	 * 		It's better to know you codes problems at compile time then making the code fail at run time
	 */
	
	public static void main(String[] args) {
		
		Test<String> test1 = new Test<>("String");
		
		System.out.println(test1.getObject());
		
		//Test<Integer> test2 = new Test<>("Hello");
		
		//System.out.println(test2.getObject());
		
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
		
		WildCards wild = new WildCards();
		
		List<Object> list2 = Arrays.asList(1, 4, 56, 7);
		
		wild.printOnlyIntegerClassorSuperClass(list1);
		wild.printOnlyIntegerClassorSuperClass(list2);
		
	}

}

class Test<T>{	
	
	T obj;
	public Test(T obj) {
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}


class MultipleTest<T, U, F>{
	
	T obj1;
	T obj5;
	U obj2;
	F obj3;
	
	public MultipleTest(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
}


// Upper bound wildcard

/*
 * These wildcards can be used when you want to relax restriction for a variable.
 * Example:
 * You want to write a method that works on List<Integer>, List<Double>, List<Number>, etc, you can do
 * this with an upper bounded wildcard.
 * 
 * List<? extends Number> list
 */

/*
 * Lower Bound Wildcard
 * 
 * Expressed using the wildcard character ? followed by super
 * 
 * 
 * Unbounded Wildcard
 * This wildcard type is specified using just ?, for example list,
 * 
 * When writing a method that can be employed using functionality provided in Object Class
 * 
 * Wehn the code is using methods in the generic class that doesn't depend on the type parameter
 */

class WildCards{

	// Upper bound
	public static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}
		return sum;
	}
	
	// lower bound
	/* In this case the arguments can be integer or superclass of Integer (which is Number)
	The method printOnlyIntegerClassorSuperClass will only take integer or its superclass objects
	However, if we pass a list of types Double then we will get a compilation error
	It is because only the Integer field or its superclass can be passed
	Double is not a superclass of Integer
*/
	public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
		System.out.println(list);
	}
	

	public static void printList(List<?> list) {
		System.out.println(list);
	}
}

