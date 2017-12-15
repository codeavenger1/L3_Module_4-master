// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!
package threads;
// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class BruteForceCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000_000);
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();

		Thread [] thread = new Thread[4];
	thread[0] = new Thread (new Runnable() {
		public void run() {
			int ctr = 000;
			while(!checkCode(ctr++));
			
			endTime = System.currentTimeMillis();
			elapsedTime = (float)(endTime - startTime);
			elapsedTime /= 1000.f;
			System.out.println("Total time taken: " + elapsedTime + " seconds");
		}
	});
	thread[1] = new Thread (new Runnable() {
		public void run() {
			int ctr = 10000;
			while(!checkCode(ctr++));
			
			endTime = System.currentTimeMillis();
			elapsedTime = (float)(endTime - startTime);
			elapsedTime /= 1000.f;
			System.out.println("Total time taken: " + elapsedTime + " seconds");
		}
	});
	
	thread[2] = new Thread (new Runnable() {
		public void run() {
			int ctr = 1000000;
			while(!checkCode(ctr++));
			
			endTime = System.currentTimeMillis();
			elapsedTime = (float)(endTime - startTime);
			elapsedTime /= 1000.f;
			System.out.println("Total time taken: " + elapsedTime + " seconds");
		}
	});
	
	thread[3] = new Thread (new Runnable() {
		public void run() {
			int ctr = 10000000;
			while(!checkCode(ctr++));
			
			endTime = System.currentTimeMillis();
			elapsedTime = (float)(endTime - startTime);
			elapsedTime /= 1000.f;
			System.out.println("Total time taken: " + elapsedTime + " seconds");
		}
	});
	
	for (int i = 0; i < thread.length; i++) {
		thread[i].start();
		System.out.println(thread[i]);
	}
	for (int i = 0; i < thread.length; i++) {
		try {
			thread[i].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread[i]);
	}
	
		
		
		
		endTime = System.currentTimeMillis();
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}
	
	public static boolean checkCode(long p){
		if(p == code){
			System.out.println("found" + p);
			return true;
		}else{
			return false;
		}
	}
}
