
public class code16_forloop {
	
	public static void main (String[]args) {
		
		int k = 1;
		for (int i =1; i <=5; i++) {
			
			for (int j =1; j <=k; j++) {
				
				System.out.print("*");
//				System.out.print(i);
//				System.out.print(j);
			}
			k = k+2;
			System.out.println();
			
		}
	}
	

}
