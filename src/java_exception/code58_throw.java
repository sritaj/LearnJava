package java_exception;

class ATMException extends Exception{
	
	public ATMException(String string) {
		super(string);
	}
	
}

class ATM{
	
	int atmpin = 4456;
	int balance = 40000;
	
	void enterpin(int n) throws ATMException {
		
		if (n == atmpin) {
			
			System.out.println();
			
		} else {
			throw new ATMException("Invalid atm pin; please try again");
		}
	}
	
	void withdrawal(int m) throws ATMException {
		
		if (m<=balance) {
			
			balance = balance - m;
			System.out.println("Withdrawan amount is " +m + " balance remaining is " +balance);
		} else {
			throw new ATMException("In sufficient balance");
		}
	}
		
}


public class code58_throw {
	
	public static void main(String[] args) throws ATMException {
		
		ATM atm = new ATM();
		try {
		atm.enterpin(4456);
		atm.withdrawal(6000);
		
	}catch(ATMException e) {
		System.out.println(e.getMessage());
	}

   }
}
