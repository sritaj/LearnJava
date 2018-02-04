
public class code2_if {
	
	public static void main(String[] args) {
		
		int balance = 10000;
		int withdrawal = 2000;
		
		if(balance >= withdrawal) {
			
			balance = balance - withdrawal;
			
			System.out.println("Amount withdrawn is " + withdrawal +" INR");
			System.out.println("Balance Amount is " + balance + " INR");
		}else {
			System.out.println("Insufficient balance");
		}
	}

}
