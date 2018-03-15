package java_exception;

public class code54_trycatch {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 2;
		
		try {
			int [] arr = new int [3];
			arr[5] = i/j;
			System.out.println(arr[1]);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception is handled");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Bound is handled ");
		}
		catch (Exception e) {
			System.out.println("General Exception handled");
		}
		System.out.println("Out of try-catch block");
	}

}
