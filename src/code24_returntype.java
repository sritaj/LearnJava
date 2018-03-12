
public class code24_returntype {
	
	int add(int a,int b) {
		int c = a+b;
		return c;	
	}
	
	char grade(char a) {
		return a;
	}
	
	double number() {
		return 10.00;
	}
	
	String name(String s) {
		return s;
	}
	
	
	public static void main(String[] args) {
		
		code24_returntype co = new code24_returntype();
		
		System.out.println(co.add(10, 20));
		
		System.out.println(co.grade('Z'));
		
		System.out.println(co.number());
		
		System.out.println(co.name("Sritaj"));
	}

}
