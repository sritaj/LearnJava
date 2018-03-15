package java_exception;

public class code53_trycatch {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		try {
		int n = i/j;
		System.out.println(n);
		}
		catch (ArithmeticException a) {
			
			System.out.println("Arithmetic Exception found");
		}
		catch (Exception e) {
			System.out.println("Exception found");
		}
		System.out.println("Out of try catch block");
		
	}
		

}
