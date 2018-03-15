package java_exception;

public class code56_nestedtrycatch {
	
	public static void main(String[] args) {
		
		String s = "5";
		int i = 0;
		int j = 0;
		
		try {
			i = Integer.parseInt(s);
			
			System.out.println("i value is " +i);
			
			try {
				j = 10/i;
			}catch (ArithmeticException e) {
				
				System.err.println(e.getMessage());
			} System.out.println("j value is " +j);
		}catch (NumberFormatException r) {
			
			System.err.println(r.getMessage());
		} 
		System.out.println("Out of try catch block");
	
	}

}
