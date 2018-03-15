package java_basics;

public class code18_forloop {
	
	public static void main(String[] args) {
		int limit = 5;
		int star = 5;
		int space = 1;
		for (int i =1; i<=limit; i++) {
			
			for (int j = 1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			for (int k = 1; k<=space; k++) {
				System.out.print(" ");
			}
			star--;
		    space++; 
		}
		
	}

}
