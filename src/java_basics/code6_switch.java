package java_basics;

public class code6_switch {
	
	public static void main(String[] args) {
		
		char grade = 'E';
		
		switch(grade) {
		
		case 'A': System.out.println("First Class with Distinction");
		break;
		
		case 'B': System.out.println("First Class");
		break;
		
		case 'C': System.out.println("Second Class");
		break;
		
		case 'D': System.out.println("Third Class");
		break;
		
		case 'E': System.out.println("Failed");
		break;
		
		default: System.out.println("Invalid Entry");
		
		}
	}

}
