package com.gsv.lab9;
class MyThread1 extends Thread
{
	// Override the run method
	@Override
	public void run()
	{
		// Code that should run in the thread
		System.out.println("Thread is running:"+Thread.currentThread().getName());;
	}
}

public class exp2 {
	public static void main(String[] args) {
		// Create an instance of MyThread
		MyThread1 thread=new MyThread1();
		// Start the thread
		thread.start();
		// Print a message in the main method
		System.out.println("Main thread is running:"+Thread.currentThread().getName());
	}

}
