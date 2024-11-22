package com.gsv.lab8;

import java.util.Arrays;

public class exp3 {
	public static void main(String[] args) {
		// Array of 10 names
		String[]names= {"Ansh","Aditya","Vikrant","Chakshu","Ankit","Asmit","Rahul","Yuvraj","Krish","Karan"};
		// Process the names by deleting the first three characters
		for(int i=0;i<names.length;i++)
		{
			if(names[i].length()>3)
			{
				names[i]=names[i].substring(3);
			}
			else
			{
				names[i]="";
			}
		}
		// Sort the resulting names in alphabetical order
		Arrays.sort(names);
		// Print out the sorted names
		System.out.println("Processed names in alphabetical order:");
		for(String name:names)
		{
			System.out.println(name);
		}
	}

}
