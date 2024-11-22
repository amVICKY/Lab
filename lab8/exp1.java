package com.gsv.lab8;

import java.util.Scanner;

public class exp1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Read the line of text from the console
		String input=sc.nextLine();
		// Find the first occurrence of"the"
		int firstPos=input.indexOf("the");
		// Find the last Occurrence  of"the"
		int lastPos=input.lastIndexOf("the");
		// Check if"the"occurs at least twice
		if(firstPos !=-1 && lastPos!=-1 && firstPos!=lastPos)
		{
			// Copy characters between the two positions
			String enclosedString=input.substring(firstPos+3,lastPos);
			// Print the result
			System.out.println("Characters enclosed between the first and last Position");
			System.out.println(enclosedString);
		}
		else {
			System.out.println("The string 'the' does not occur at least twice in the input.");
		}
	}

}
