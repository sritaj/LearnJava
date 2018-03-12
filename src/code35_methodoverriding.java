class A{
	
	int i = 39;
	
	void m1() {
		
		System.out.println("A");
	}
}


class B extends A{
	
	int i = 66;
	
	void m1() {
		
		System.out.println(super.i);
		super.m1();
		System.out.println("B");
		
	}
}

public class code35_methodoverriding {

	public static void main(String[] args) {
		
		B test = new B();
		test.m1();
	}

}
