
public class code12_forloop {
	
	public static void main(String[] args) {
		
		int n = 1;
		char s = 'A';
		
		for (int i = 1; i<=4; i++
				) {
			
			for (int j = 1; j<=i; j++) {
				
				if (i==1 || i ==3 ) {
					
					System.out.print(n);
					n++;
				}else {
					
					System.out.print(s);
					s++;
					
				}
		}
			
			System.out.println();
	}

	}
}
