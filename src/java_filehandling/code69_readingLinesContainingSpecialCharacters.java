package java_filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class code69_readingLinesContainingSpecialCharacters {
	
public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("java-text\\test008.txt");
		BufferedReader br = new BufferedReader(fr);
		String strLine;
		
		while ((strLine = br.readLine())!=null) {
			if(strLine.contains("@")) {
				System.out.println(strLine);
			}
		}
	
	}	
}
