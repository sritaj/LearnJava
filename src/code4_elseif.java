
public class code4_elseif {
	
	public static void main(String[] args) {
		
		int marks = 95;
		
		if (marks >= 90 ) {
			
			System.out.println("Congrats!!! You got O grade");
		}else if (marks < 90 && marks >=80) {
			
			System.out.println("Congrats!!! You got E grade");
		}else if (marks < 80 && marks >=70) {
			
			System.out.println("Congrats!!! You got A grade");
		}else if (marks < 70 && marks >= 50) {
			
			System.out.println("Congrats!!! You got B grade");
		}else if (marks < 50) {
			
			System.out.println("Poor performance!!! You have to reattempt the exams");
		}
	}

}
