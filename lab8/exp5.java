package com.gsv.lab8;

import java.util.Scanner;

public class exp5
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Read a line of text from the console
		System.out.println("Enter a line of text:");
		String input=sc.nextLine();
		// Split the input into words
		String[] words=input.split("\\s+");
		// Process each word
		StringBuilder result=new StringBuilder();
		for(String word:words)
		{
			if(word.length()>0)
			{
				// Capitalize the first character and append the rest of the string
				String capitalizeWord=word.substring(0, 1).toUpperCase()+word.substring(1);
				result.append(capitalizeWord).append("");
			}
		}
		// Print the resulting string 
		System.out.println("Output:");
		System.out.println(result.toString().trim());
	}

}
