public class code43_static_nonstatic {
	
	void m1() {
		
		System.out.println("Non static Method");
	}
	
	static void m2() {
		
		System.out.println("Static Method");
	}
	
	void m3() {
		
		m1();
		m2();
		System.out.println("Calling Non Static and Static Methods");
	}

	public static void main(String[] args) {
		
		m2();
		
		code43_static_nonstatic code = new code43_static_nonstatic();
		code.m1();
		code.m3();
		
		
	}
	

}
