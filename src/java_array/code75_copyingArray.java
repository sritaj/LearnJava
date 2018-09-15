package java_array;

import java.util.Arrays;

public class code75_copyingArray {
	
	public static void main(String[] args) {
		
		
		int arr[] = {12, 14, 35,67, 89, 21};
		int arr_new[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr_new[i] = arr[i];
		}
		
		System.out.println("Copied array is " + Arrays.toString(arr_new));
		
	}

}
