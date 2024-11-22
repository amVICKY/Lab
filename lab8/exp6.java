package com.gsv.lab8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class exp6
{
	public static void main(String[] args) {
		String fileName="C:\\Users\\ansh sharma\\eclipse-workspace\\Assignment8\\src\\com\\Ass8\\ReplaceWords.java\\sdj.txt";
		try {
			String content=new String(Files.readAllBytes(Paths.get(fileName)));
			// Replace all occurrences  of"his" with"her"
			String updatedContent=content.replace("his","her");
			// Write the updated content back to the file
			Files.write(Paths.get(fileName), updatedContent.getBytes());
			System.out.println("All occurences of'his' have been replaced with'her'.");
		}
		catch(IOException ex)
		{
			System.out.println("An error occured while processing the file:"+ex.getMessage());
		}
	}

}
