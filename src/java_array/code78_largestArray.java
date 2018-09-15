package java_array;

public class code78_largestArray {
	
	public static void main(String[] args) {
		
		int arr1[] = {11, 12, 33, 45, 24, 56};
		
		int large = 0;
		
		for (int i =0; i < arr1.length; i++) {
			
			System.out.println(arr1[i]);
			
			for (int j = i+1; j < arr1.length; j++) {
				
				System.out.println(arr1[j]);
				
				if (arr1[i]>arr1[j]) {
					
				large = arr1[i]	;
					
				}
			}
		}
		
		System.out.println("Large number is " +large);
	}

}
