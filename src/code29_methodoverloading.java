
public class code29_methodoverloading {
	
	void m1 (int i) {
		
		System.out.println(i);
	}
	
	void m1 (int i, int j) {
		
		System.out.println(i + j);
	}
	
	void m1 (String s, int i) {
		
		System.out.println(s);
		System.out.println(i);
		
	}
	
	void m1 (char c, int j) {
		
		System.out.println(c);
		System.out.println(j);
	}
	
	void  m1 (int j, char c) {
		
		System.out.println(j);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		code29_methodoverloading code = new code29_methodoverloading();
		
		code.m1(10);
		code.m1(34, 156);
		code.m1("Jack", 45);
		code.m1('X', 10);
		code.m1(12, 'C');
	}

}
