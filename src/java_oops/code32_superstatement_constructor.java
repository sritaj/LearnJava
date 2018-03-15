package java_oops;
class Alpha {
	
	Alpha(){
		
	System.out.println("Alpha is here");
	
	}
}

class Beta extends Alpha {
	
	Beta(){
		
		System.out.println("Beta is here");
	}
}

class Gamma extends Beta {
	
	Gamma() {
		
		System.out.println("Gamma is here");
	}
}


public class code32_superstatement_constructor {
	
	public static void main(String[] args) {
		
		Gamma g = new Gamma();
		
	}

}
