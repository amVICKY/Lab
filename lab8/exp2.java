package com.gsv.lab8;

import java.util.Scanner;

public class exp2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Input the line of text by user
		System.out.println("Enter a line of text");
		String str=sc.nextLine();
		System.out.println("Vowels and their positions:");
		// Iterate through the input string
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			// Check if the character is a vowel
			if(isVowel(ch))
			{
				// Print the vowel and its position
				System.out.println("Vowel:"+ch+",Position:"+i);
				
			}
		}
	}
	// Method to check if a character is a vowel
	public static boolean isVowel(char ch)
	{
		ch=Character.toLowerCase(ch);
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
	}

}
