package java_basics;

public class code10_forloop {
	
public static void main (String[]args) {
		
		for (int i = 1; i<=3; i++) {
			
			for (int j = 1; j<=i; j++) {
			
				if (i == 1) {
					System.out.print("A");
				} else if (i == 2){
					System.out.print("B");
				} else {
					System.out.print("C");
				}
			}
			
			System.out.println();
		}
	}

}

