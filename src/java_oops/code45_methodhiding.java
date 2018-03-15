package java_oops;
class parent{
	
	static void m1() {
		
		System.out.println("I am parent class");
	}
	
}

class child extends parent{
	
	static void m1() {
		System.out.println("I am child class");
	}
}
public class code45_methodhiding {
	

	
	public static void main(String[] args) {
		
		parent p = new child();
		p.m1();
		
	}

}
