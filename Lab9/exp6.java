package com.gsv.lab9;
class FibonacciThread extends Thread {
	private  int[] fibonacciNumbers=new int[50];
	public FibonacciThread()
	{
		this.setPriority(8);
	}
	@Override
	public void run()
	{
		computeFibonacci();
		// Print the first 50 Fibonacci numbers
		System.out.println("First 50 Fibonacci Numbers:");
		for(int num:fibonacciNumbers)
		{
			System.out.println(num+" ");
		}
		System.out.println();
		try {
			// Sleep after computing Fibonacci numbers
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void computeFibonacci()
	{
		fibonacciNumbers[0]=1;
		fibonacciNumbers[1]=1;
		for(int i=2;i<50;i++)
		{
			fibonacciNumbers[i]=fibonacciNumbers[i-1]+fibonacciNumbers[i-2];
		}
	}
}
class PrimeNumberThread extends Thread {
	private int [] primeNumbers=new int[25];
	public PrimeNumberThread()
	{
		this.setPriority(5);
	}
	@Override
	public void run()
	{
		computePrimes();
		// Print the first 25 prime numbers
		System.out.println("First 25 Prime Numbers");
		for(int num:primeNumbers)
		{
			System.out.println(num+"");
		}
		System.out.println();
			
		
	}
	private void computePrimes()
	{
		int count=0;
		int num=2;
		while(count<25)
		{
			if(isPrime(num))
			{
				primeNumbers[count]=num;
				count++;
			}
			num++;
		}
	}
	private boolean isPrime(int num)
	{
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}

public class exp6 {
	public static void main(String[] args) {
		FibonacciThread fibonacciThread=new FibonacciThread();
		PrimeNumberThread primeNumberThread=new PrimeNumberThread();
		// Start the Fibonacci thread
		fibonacciThread.start();
		try
		{
			// Wait for the Fibonacci thread to complete its initial run
			fibonacciThread.join();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		// Start the Prime number thread
		primeNumberThread.start();
		try
		{
			// Wait for the Prime number thread to complete
			primeNumberThread.join();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		// Resume Fibonacci thread
		fibonacciThread.run();
	}

}
