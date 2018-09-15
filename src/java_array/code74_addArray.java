package java_array;

public class code74_addArray {
	
	public static void main(String[] args) {
		
		int [] ir = {1,3,4,5,7,12,98,00,100,23,45};
		
		int sum = 0;
		
		for (int i = 0; i<ir.length; i++) {
			
			sum = sum + ir[i];
			
		}
		
		double avg = sum/ir.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
