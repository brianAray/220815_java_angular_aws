package com.revature.wednesday;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	
	/*
	 * Thread Pools
	 * 
	 * They decouple the task of task submission and execution.
	 * 
	 * You have the option of exposing the configuration for the executor while deploying an application
	 * or switching one executor for another relatively easily
	 * 
	 * A thread pool basically has a group of threads that are assigned to execute tasks
	 * 
	 * Once a worker is finished, it is returned to the pool
	 * Usually thread pools are bound to a queue from which tasks are dequeued for execution by the worker
	 * threads
	 * 
	 * A thread pool can be tuned for the size of the threads it holds
	 * A thread pool may also replace a thread if it dies of an unexpected exception
	 * Using a thread pool immediately alleviates from the difficulty of manually creating threads
	 * 
	 * 
	 * Important points:
	 * - There is no latency when a request is received and processed by a thread because no time is lost
	 * in creating the thread
	 * 
	 * - The system will not go out of memory because threads are not created without any limits
	 * 
	 * - Fine tuning the thread pool will allow us to control the throughput of the system.
	 * We can have enough threads to keep all processors busy but not so many so as to overwhelm your
	 * system
	 * 
	 * 
	 */
	
	/*
	 * Executor Framework
	 * 
	 * Java provides the executor framework which is centered around the Executor interface, it's
	 * sub-interface - ExecutorService and the class - ThreadPoolExecutor, which implements both of these
	 * interfaces
	 * 
	 * In order to use the Executor, you must implement the Runnable objects and send them to the
	 * executor to execute
	 * 
	 * Steps to follow
	 * 
	 * 1. Create a task (Runnable Object) to execute
	 * 2. Create Executor Pool using Executors
	 * 3. Pass tasks to Executor Pool
	 * 4. Shutdown the Executor Pool
	 */
	
	public static void main(String[] args) {
		// Step 1 - Create 5 tasks 
	
		Runnable r1 = new Task("Task 1");
		Runnable r2 = new Task("Task 2");
		Runnable r3 = new Task("Task 3");
		Runnable r4 = new Task("Task 4");
		Runnable r5 = new Task("Task 5");
		
		// Step 2 - Create a thread pool with a max number of threads
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		// Step 3 - Pass tasks to pool
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		// Step 4 - pool shutdown
		pool.shutdown();
	}
}

class Task implements Runnable{
	
	private String name;
	
	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i <=5 ; i++) {
				if (i == 0) {
					LocalTime d = LocalTime.now();
					System.out.println("Initialization time for name: " + name + " = " + d);
				}
				else {
					LocalTime d = LocalTime.now();
					System.out.println("Executing Time for task name: " + name + " = " + d);
				}
				Thread.sleep(1000);
			}
			System.out.println(name + " is completed");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

/*
 * Risks in using Thread Pools
 * 
 * Deadlock 
 * While deadlock can occur in any multi-threaded program, thread pools introduce another
 * case of deadlock. In this case, all the executing threads are waiting for the results from the
 * blocked threads waiting in the queue due to the unavailability of threads for execution.
 * 
 * Thread Leakage
 * Thread leakage occurs if a thread is removed from the pool to execute a task but not returned
 * to it when the task is completed.
 * An example, if the thread throws an exception and pool class does not catch this exception, then
 * the thread will simply exit, reducing the size of the pool by one. If this repeats, eventually the
 * pool will become empty and no threads would be available to execute any other requests.
 * 
 * Resource Thrashing
 * If the thread pool size is very large the time is wasted in context switching between threads.
 * Having more threads than the optimal number may cause starvation problem leading to
 * resource thrashing as explained.
 * 
 * 
 */









