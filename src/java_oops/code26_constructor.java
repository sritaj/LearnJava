package java_oops;

public class code26_constructor {
	
	code26_constructor(){
		
		System.out.println("I am a non parameterized constructor");
	}
	
	code26_constructor(int i){
		
		System.out.println(i);
	}
	
	void number() {
		
		System.out.println("I am in a method");
	}
	
	public static void main(String[] args) {
		
		code26_constructor con = new code26_constructor();
		
		code26_constructor con1 = new code26_constructor(15);
		
		con.number();
		con1.number();
	}

}
