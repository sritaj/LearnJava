package java_filehandling;

import java.io.File;
import java.io.FileNotFoundException;

/*  Program to delete text file */

public class code66_deletefile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("test002.text");
		
		if(f.exists()) {
			f.delete();
			System.out.println("File deleted succesfully");
		}else {
			System.out.println("No file found");
		}

	}

}
