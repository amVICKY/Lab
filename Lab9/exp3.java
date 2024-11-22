package com.gsv.lab9;
// Class to calculate the sine series
class SineCalculator extends Thread{
	private double x;
	private double result;
	public SineCalculator(double x)
	{
		this.x=x;
	}
	@Override
	public void run()
	{
		result=calculateSine(x);
		System.out.println("Computed sin("+x+")="+result);
		
	}
	private double calculateSine(double x)
	{
		double sine=0.0;
		int n=10;
		// Number of terms in the series
		for(int i=0;i<n;i++)
		{
			double term=Math.pow(-1, i)*Math.pow(x, 2*i+1)/factorial(2*i+1);
			sine+=term;
		}
		return sine;
		
	}
	private double factorial(int n)
	{
		if(n==0)
		return 1;
		double fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
// Class to calculate the cosine series
class CosineCalculator extends Thread{
	private double x;
	private double result;
	public CosineCalculator(double x)
	{
		this.x=x;
	}
	@Override
	public void run()
	{
		result=calculateCosine(x);
		System.out.println("Computed cos("+x+")"+result);
		
	}
	private double calculateCosine(double x)
	{
		double cosine=0.0;
		int n=10;// Number of terms in the series
		for(int i=0;i<n;i++)
		{
			double term=Math.pow(-1, i)*Math.pow(x, 2*i)/factorial(2*i);
			cosine+=term;
		}
		return cosine;
		
	}
	private double factorial(int n)
	{
		if(n==0)
		return 1;
		double fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
}



// Main class to start the threads
public class exp3 {
	public static void main(String[] args) {
		double x=Math.toRadians(45);// Example value in radians
		SineCalculator sineThread=new SineCalculator(x);
		CosineCalculator cosineThread=new CosineCalculator(x);
		sineThread.start();
		cosineThread.start();
		// Wait for both thread to complete
		try {
			sineThread.join();
			cosineThread.join();
		}
		catch(InterruptedException e)
		{
			
		}
		// Verify the Math class
		System.out.println("Math.sin("+x+")="+Math.sin(x));
		System.out.println("Math.cos("+x+")="+Math.cos(x));
		
	}

}
