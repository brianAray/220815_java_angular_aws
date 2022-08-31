package com.revature.wednesday;

public class MultiThreadingExample {

	/*
	 * Multithreading
	 * 
	 * There are two ways to create a thread
	 * 
	 * 1 - Implement the Runnable interface and pass it to a new Thread object constructor
	 * 
	 * 2 - Extend the Thread Class and create an object of that class
	 * 
	 * They're both valid
	 */
	
	public static void main(String[] args) {
		
		Thread t1 = new NewThread();
		
		t1.start();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// This thread (main) belongs to the main thread
		System.out.println("Hello from the main thread! Its name is " + Thread.currentThread().getName());
		
		
		// 2nd way to create a thread (anonymous classes .. lambda to provide the 
		//functionality of the run() method)
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("We are now in Thread: " + Thread.currentThread().getName());
			}
			
		});
		
		Thread t3 = new Thread(() -> System.out.println("Running from Lambda Thread"));
		
		
		t2.setName("Greg");
		t2.start();
		t3.start();
		
		

		/*
		 * Thread States:
		 * 
		 * - New
		 * - Runnable (its run() method has been implemented)
		 * - Running
		 * - Non-runnable (blocked)
		 * - Terminated
		 * 
		 */
		
		
		
	}
}
