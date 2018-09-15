package java_filehandling;

import java.io.FileReader;
import java.io.IOException;

/*  Program to read from text file */

public class code63_read {

	public static void main(String[] args) {
		
		String filepath = "test001.text";
		
		try {
			
			FileReader fr = new FileReader(filepath);
			
			int i;
			
			while((i=fr.read())!=-1) {
				
				System.out.println((char)i);
			}
			
		}catch (IOException e) {
			System.out.println("Text file not found");
		}
	}
	
}
