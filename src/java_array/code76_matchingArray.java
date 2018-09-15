package java_array;

import java.util.Arrays;

public class code76_matchingArray {
	
	public static void main(String[] args) {
		
		
		int arr1[] = {1,4,67,12,34};
		int arr2[] = {1,4,67,12,34};
		int arr3[] = {8, 12, 32, 11, 5};
		int arr4[] = {8, 13, 31, 11, 5};
		
	
		if (Arrays.equals(arr1, arr2)	) {
			
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
		
		for (int i = 0; i <arr3.length; i++) {
			
			for (int j = 0; j < arr4.length; j++) {
				
				if (arr3[i]==arr4[j]) {
					
					System.out.println("Matching elements " +arr3[i]);
				}
			}
		}
	}

}
