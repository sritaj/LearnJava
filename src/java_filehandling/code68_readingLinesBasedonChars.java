package java_filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class code68_readingLinesBasedonChars {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("java-text\\test007.txt");
		BufferedReader br = new BufferedReader(fr);
		String strLine;
		
		while ((strLine = br.readLine())!=null) {
			if(strLine.startsWith("/*")&& strLine.endsWith("*/")) {
				System.out.println(strLine);
			}
		}
	
	}		


}
