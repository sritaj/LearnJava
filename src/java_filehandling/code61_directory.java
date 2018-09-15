package java_filehandling;

import java.io.File;

/*  Program to create a directory */

public class code61_directory {
	
	public static void main(String[] args) {
		
		try {
			File f = new File("java-text");
			
			if (f.exists()) {
				System.out.println("Folder already present");
			}else {
				f.mkdir();
				System.out.println("Folder is created");
			} 
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
