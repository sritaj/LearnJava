
public class code3_ifladder {
	
	public static void main(String[] args) {
		
		int atmpin = 1234;
		int balance = 10000;
		int withdrawal = 5000;
		
		if(atmpin == 1235) {
			System.out.println("Pin authenticated");
			
			if (balance >= withdrawal) {
				
				balance = balance - withdrawal;
				
				System.out.println("Amount withdrawn is " +withdrawal + " INR");
				System.out.println("Remaining balance is " +balance + " INR");
			}else {
				
				System.out.println("Insufficient funds");
			}
		}else {
			System.out.println("Invalid Pin");
		}
	}

}
