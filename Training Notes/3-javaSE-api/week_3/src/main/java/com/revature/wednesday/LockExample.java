package com.revature.wednesday;

public class LockExample implements Runnable{
	
	/*
	 * Every object in Java has a unique lock.
	 * Whenever you use the synchronized keyword, then the lock is used for that object
	 * If a thread wants to execute a synchronized method on the given object, it first has
	 * to get a lock of that object.
	 * 
	 * Once the thread has got the lock, it is allowed to execute any synchronized method on
	 * that object.
	 * Once method execution is completed, automatically, the lock is released by the thread.
	 * 
	 * This is done by the JVM and you do not have to do it explicitly
	 */
	
	class lockClass{
		
		
		public synchronized void lockMethod(){}
	
		
		public void lockMethod2() {
			
			synchronized(this) {
				// thread safe code here
			}	
		}
		
		
		private final Object lock = new Object();
		
		public void demoLock() {
			synchronized(lock) {
				// Thread safe code
			}
		}
	}

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		Lock();
	}
	
	public void Lock() {
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this) {
			System.out.println(
					"In block" + Thread.currentThread().getName()
					);
			System.out.println(
					"In Block" + Thread.currentThread().getName() + " end"
					);
		}
	}
	
	public static void main(String[] args) {
		LockExample g = new LockExample();
		
		Thread t1 = new Thread(g);
		Thread t2 = new Thread(g);
		Thread t4 = new Thread(g);
		Thread t5 = new Thread(g);
		Thread t6 = new Thread(g);
		Thread t7 = new Thread(g);
		Thread t8 = new Thread(g);
		Thread t9 = new Thread(g);
		
		
		
		// Create another lock example
		
		LockExample g2 = new LockExample();
		
		Thread t3 = new Thread(g2);
		
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		
		t1.start();
		t2.start();
		//t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		
	}

}
