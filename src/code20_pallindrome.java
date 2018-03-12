
public class code20_pallindrome {
	
	public static void main(String[] args) {
		
		int num = 511;
		int rev = 0;
		int temp = num;
		
		while (num!= 0) {
			
			int rem = num%10;
			num = num/10;
			rev = rev * 10 + rem;
			
		}
		
		if (temp == rev) {
			System.out.println("Number is pallindrome");
		}else {
			System.out.println("Number is not pallindrome");
		}
	}

}
