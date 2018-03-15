package java_oops;
class m1{
	
	int m = 10;
	String s = "Super";
	
	void v1(int m) {
		
		System.out.println(this.m);
		System.out.println("Java");
		System.out.println("Welcome");
		
		
	}

}

class m2 extends m1{
	
	int m = 49;
	String s = "Python";
	
	void v2(int m) {
		
		super.v1(76);
		System.out.println(super.m);
		System.out.println(super.s);
		
	}
	
  }


public class code32_super_inheritance {

	public static void main(String[] args) {
		
		m2 test = new m2();
		test.v2(19);
		System.out.println(test.m);
	}

}
