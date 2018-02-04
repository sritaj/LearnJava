/* WAP to print Sanju if the number is divisible by 3 and to print Geeta if number is divisible by 5 and to
 * print Sanju Weds Geeta if the number is divisible by both 3 and 5 else print Divorce if it not divisible by
 either 3 or 5*/

public class code5_elseif {
	
	public static void main(String[] args) {
		 
		int number = 1;
		
		if (number%3 == 0 && number%5 == 0) {
			
			System.out.println("Sanju Weds Geeta");
		} else if (number%3 == 0) {
			
			System.out.println("Sanju");
		} else if (number%5 == 0) {
			
			System.out.println("Geeta");
		} else {
			
			System.out.println("Divorce");
		}
	}

}
