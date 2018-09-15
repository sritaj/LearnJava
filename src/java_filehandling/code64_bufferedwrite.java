package java_filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*  Program to write into text file using BufferedWriter */

public class code64_bufferedwrite {
	
	public static void main(String[] args) {
		
		try {
			File f = new File("test002.text");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Open the text file");
		    bw.newLine();
			bw.write("Writing into text file using BufferedWriter");
			bw.close();

			}catch (IOException i) {
				i.printStackTrace();
		}
	}

}
