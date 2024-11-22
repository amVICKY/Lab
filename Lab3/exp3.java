package com.gsv.lab3;

class X
{
	protected int i,j;
	public X(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public int findSum()
	{
		return i+j;
	}
}

class Y extends X
{
	public Y(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}
	
	public int findProduct()
	{
		return i*j;
	}
}

class Z extends Y
{

	public Z(int i, int j) {
		super(i, j);
		// TODO Auto-generated constructor stub
	}
	
	public int findDifference()
	{
		return i-j;
	}
}

public class exp3 {
	public static void main(String[] args)
	{
		Z obj = new Z(10,5);
		
		System.out.println("Sum of i and j:"+obj.findSum());
		System.out.println("Difference between i and j: "+obj.findDifference());
		System.out.println("Product of i and j: "+obj.findProduct());
	}
}
