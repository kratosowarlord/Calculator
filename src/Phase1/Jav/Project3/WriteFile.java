package Phase1.Jav.Project3;

import java.util.*;
import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		
		/*
		 * This java program can write and append files while taking input from the
		 * User.Follow the steps in the comments and you can write and create the file to write
		 * Text.
		 * 
		 */
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter the Text to be written into the file");

		String data = scr.nextLine();

		try {
			// Step 1: Creates a Writer using FileWriter
			
			File writer = new File("WriterExample.txt");
			
			// Checking for duplicate file
			
			if(!writer.exists()) {
				writer.createNewFile();
			}
			//Writing data using Writer and Buffered Writer.

			FileWriter output = new FileWriter(writer,true);
			
			BufferedWriter f2 = new BufferedWriter(output);

			// Step 2: Writes string to the file using Scanner input.
			
			f2.write(data);
			System.out.println("Data is written to the file.");
			


			// Step 3: Closes the writer
			
			f2.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		scr.close();

	}
}
