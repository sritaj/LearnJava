package java_oops;

public class code30_constructoroverloading {
	
	code30_constructoroverloading(){
		
		System.out.println("Constructor Overloading");
	}
	
	code30_constructoroverloading(int i){
		
		System.out.println(i);
	}
	
	code30_constructoroverloading(int i, int j){
		
		System.out.println(i+j);
	}
	
	code30_constructoroverloading(String s, int i){
		
		System.out.println(s);
		System.out.println(i);
	}
	
	code30_constructoroverloading(int j, String d){
		System.out.println(j);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		code30_constructoroverloading code = new code30_constructoroverloading();
		code30_constructoroverloading code1 = new code30_constructoroverloading(35);
		code30_constructoroverloading code2 = new code30_constructoroverloading(12, 19);
		code30_constructoroverloading code3 = new code30_constructoroverloading("Ash", 123);
		code30_constructoroverloading code4 = new code30_constructoroverloading(78, "Paul");
	}

}
