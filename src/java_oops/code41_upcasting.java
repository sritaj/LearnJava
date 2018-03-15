package java_oops;
class A1{
	
	int i = 10; 
	
	void m1(){
		
		System.out.println("Parent Class");
	}
	
}

class B1 extends A1{
	
	int i = 20;
	
	void m1() {
		
		System.out.println("Child Class");
	}
	
}

public class code41_upcasting {
	
	public static void main(String[] args) {
		
		A1 a = new B1();
		System.out.println(a.i);
		a.m1();
	}

}
