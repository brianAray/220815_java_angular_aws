package com.revature.wednesday;

import java.math.BigInteger;

public class InterruptExample {

	public static void main(String[] args) {
		
		// Here I will instantiate a thread by passing a runnable object to its constructor
		
		Thread compThread = new Thread(new LongComputationTask(new BigInteger("400000000000000000"), new BigInteger("200000000000000000")));
	
		/*
		 * A Daemon thread is a thread that does not prevent the JVM from
		 * Exiting when the program is finished but the thread is still running
		 */
		
		compThread.setDaemon(true);
		compThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		compThread.interrupt();
	}
	
	
	private static class LongComputationTask implements Runnable{
		
		private BigInteger base;
		private BigInteger power;
		
		public LongComputationTask(BigInteger base, BigInteger power) {
			this.base = base;
			this.power = power;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(base + "^" + power + " = " + pow(base, power));
		}
		
		private BigInteger pow(BigInteger base, BigInteger power) {
			
			BigInteger result = BigInteger.ONE;
			
			for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
				
				if(Thread.currentThread().isInterrupted()) {
					System.out.println("Thread Premature Interruption");
					return BigInteger.ZERO;
				}
				
				result = result.multiply(base);
			}
			
			return result;
		}
		
	}
	
}
