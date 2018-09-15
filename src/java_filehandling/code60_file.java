package java_filehandling;

import java.io.File;

/*  Program to create a text file */

public class code60_file {
	
	public static void main(String[] args) {
		
		try {
		
			File f = new File("test001.text");
			
			if(f.exists()) {
				
				System.out.println("File already exits");
			} else {
				f.createNewFile();
				System.out.println("File is created succesfully");
				}
				
			}catch(Exception e) {
				
				e.printStackTrace();
				
		}
		
	}
	
	

}
