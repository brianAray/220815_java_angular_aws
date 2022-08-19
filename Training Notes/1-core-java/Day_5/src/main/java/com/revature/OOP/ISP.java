package com.revature.OOP;

public class ISP {
	
	/*
	 * Interface Segregation Principle
	 * 
	 * This states that clients should never be forced to depend on an interface that they are not using
	 * in its entirety. This means than an interface should only have the minimum needed methods to achieve
	 * the correct funcitonality
	 * 
	 * 
	 */
	
	

}

interface Pizza {
	void addSauce();
	void bake();
}

class VeggiePizza implements Pizza {

	public void addSauce() {
		System.out.println("Adding Sauce");
	}

	public void bake() {
		System.out.println("Baking the Veggie Pizza");
	}
	
	public void addMushrooms() {
		System.out.println("Adding mushrooms");
	}
}

class PepperoniPizza implements Pizza {
	public void addSauce() {
		System.out.println("Adding Sauce");
	}

	public void bake() {
		System.out.println("Baking the Veggie Pizza");
	}
	
	public void addPepperoni() {
		System.out.println("Adding pepperoni");
	}
}



