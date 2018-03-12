class Company{
	
	String empname = "Sritaj";
	static String company = "Accenture";
	
	void m1() {
		
		System.out.println("m1");
	}
	static void m2() {
		
		System.out.println("m2");
	}
}

public class code44_static_nonstatic {

	String anoyname = "Lipan";
	static String company = "Global";
	
	void m3() {
		System.out.println("m3");
	}
	
	static void m4() {
		System.out.println("m4");
	}
	
	public static void main(String[] args) {
		
		code44_static_nonstatic code = new code44_static_nonstatic();
		
		System.out.println("Accessing non static members and methods in same class");
		System.out.println(code.anoyname);
		code.m3();
		
		System.out.println("Accessing static members and methods in same class");
//		System.out.println(code44_static_nonstatic.company);
//		code44_static_nonstatic.m4();
		System.out.println(company);
		m4();
		
		Company com = new Company();
		System.out.println("Accessing non static members and methods in different class");
		System.out.println(com.empname);
		com.m1();
		
		System.out.println("Accessing static members and methods in different class");
		System.out.println(Company.company);
		Company.m2();
		
	}
}
