package java_basics;

public class code17_forloop {
	
	public static void main(String[] args) {
		int limit = 5;
		int space = limit-1;
		int star = 1;
		for (int i =1; i<=limit; i++) {
			
			for (int j =1; j<=space; j++) {
				System.out.print(" ");
			}
			
			for (int k =1; k<=star; k++) {
				System.out.print("*");
				//System.out.print("* ");
			}
			
			System.out.println();
		    space--;
		    star++;
		}
		
	}

}
