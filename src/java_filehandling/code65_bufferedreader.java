package java_filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*  Program to read from text file using BufferedReader */

public class code65_bufferedreader {
	
	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("test001.text");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine())!=null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
