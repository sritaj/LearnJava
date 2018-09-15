package java_filehandling;

import java.io.FileWriter;
import java.io.IOException;

/*  Program to write into text file */

public class code62_write {
	
	public static void main(String[] args) {
		
		try {
			
			String filepath = "test001.text";
			FileWriter f = new FileWriter(filepath, true);
			
			f.write("Hello Bengaluru");
			f.write("?");
			f.close();
			
			System.out.println("Text is written");
			
		} catch(IOException i){
			System.out.println("File not found");
		}
	}

}
