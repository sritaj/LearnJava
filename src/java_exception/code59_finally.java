package java_exception;


class SIMException extends Exception{
	
	public SIMException(String string) {
		super (string);
	}
}

class SIM{
	
	void Documents(String documenttype) throws SIMException {
		
		switch (documenttype) {
		
		case "Aadhar": System.out.println("Aadhar document is submitted");
		break;
		case "DL": System.out.println("Driving license is submmited");
		break;
		case "Passport": System.out.println("Passport is submitted");
		break;
		default: throw new SIMException("Invalid Documents");
		
		}
	
	}
	
}

public class code59_finally {
	
	public static void main(String[] args) {
		
		SIM sim = new SIM();
		try {
			sim.Documents("DL");
		} catch (SIMException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Out of loop");
		}
	}

}
