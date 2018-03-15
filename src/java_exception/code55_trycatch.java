package java_exception;

public class code55_trycatch {
	
	public static void main(String[] args) {
		
		try {
			String s = "Exception";
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException e) {
			
			System.out.println("Number Format Exception Handled");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		catch(ArithmeticException f) {
		
			System.out.println("Arithmetic Exception handled");
			
		} 
		catch(Exception f) {
			
			System.out.println("Exception handled");

	    }
		catch (Throwable t) {
			
			System.out.println("Exception is present");
		}
		
		System.out.println("Out of try catch block");
		
	}

}
