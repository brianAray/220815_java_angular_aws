package com.revature.OOP;

public class SRP {

	/*
	 * Single Responsiblity Principle (SRP)
	 * 
	 * This principle states that there should never be two functionalities in one class, other wise stated as
	 * 
	 * A class should only have one, and only one, reason to be changed
	 * 
	 * "Reason to be changed" is the responsibility of the class. If there is more than one responsibility
	 * there are more reasosn to change that class at some point
	 * 
	 * This means that in the event of a functionality needing an update, there shouldn't be multiple
	 * separate functionalities in the same class that may be affected.
	 * 
	 * This makes it easier to deal with bugs, to implement new changes without confusing co-dependencies
	 * and to inherit from classes without having to implement methods or inherit them that you do not need.
	 * 
	 * 
	 * Example:
	 * 
	 * We could have a single class that handles database information retrieval for a product and then process
	 * it and display it to the end user
	 * 
	 * However, you are mixing three different functionalities into a single class
	 * 
	 * Instead, split the functionalities into three classes
	 * - ProductService
	 * 		Handling requests and processing data
	 * - ProductDao (Dao = Data Access Object)
	 * 		Making requests to the database and creating the required data
	 * - ProductController
	 * 		Displaying the product to the end user
	 */
	
}
