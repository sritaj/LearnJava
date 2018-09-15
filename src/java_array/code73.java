package java_array;

import java.util.Scanner;

public class code73 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the array size");
		int size = sc.nextInt();
		
		int[] test = new int []{size};
		
		System.out.println("Please enter the array elements");
		
		for (int i = 0; i<test.length; i++) {
			
			test[i] = sc.nextInt();
			
			
		}
		
		System.out.println("Displaying the array elements below");
		
		for (int i = 0; i<test.length; i++) {
			System.out.print(test[i]);
		}
		
		
	}

}
