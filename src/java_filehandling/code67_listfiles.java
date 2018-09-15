package java_filehandling;

import java.io.File;

/*  Program to list all the files from folder */

public class code67_listfiles {

	public static void main(String[] args) {
		
		File f = new File("java-text");
		
		File[] fi = f.listFiles();
		
		for (File ele:fi) {
			System.out.println(ele);
		}
	}
}
